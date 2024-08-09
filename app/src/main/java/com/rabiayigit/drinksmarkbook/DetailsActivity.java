package com.rabiayigit.drinksmarkbook;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.rabiayigit.drinksmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Singleton singleton=Singleton.getInstance();
        Drinksmark selectedDrinksmark=singleton.getSentDrinksmark();

        binding.drinksmarkNameText.setText(selectedDrinksmark.name);
        binding.countryNameText.setText(selectedDrinksmark.country);
        binding.imageView.setImageResource(selectedDrinksmark.image);

    }
}