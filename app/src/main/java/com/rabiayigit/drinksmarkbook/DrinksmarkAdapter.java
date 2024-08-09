package com.rabiayigit.drinksmarkbook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rabiayigit.drinksmarkbook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class DrinksmarkAdapter extends RecyclerView.Adapter<DrinksmarkAdapter.DrinksHolder> {

    ArrayList<Drinksmark>drinksmarkArrayList;

    public DrinksmarkAdapter(ArrayList<Drinksmark> drinksmarkArrayList) {
        this.drinksmarkArrayList = drinksmarkArrayList;
    }

    @NonNull
    @Override
    public DrinksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding= RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new DrinksHolder(recyclerRowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull DrinksHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.recyclerTextView.setText(drinksmarkArrayList.get(position).name);

        holder.itemView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(holder.itemView.getContext(),DetailsActivity.class);

                //chosenDrinksmark = drinksmarkArrayList.get(position);
                //intent.putExtra("drinksmsark",drinksmarkArrayList.get(position).name);

                Singleton singleton=Singleton.getInstance();
                singleton.setSentDrinksmark(drinksmarkArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return drinksmarkArrayList.size();
    }

    public class DrinksHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding binding;

        public DrinksHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
