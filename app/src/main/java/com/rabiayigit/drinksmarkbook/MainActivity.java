package com.rabiayigit.drinksmarkbook;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.rabiayigit.drinksmarkbook.databinding.ActivityDetailsBinding;
import com.rabiayigit.drinksmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Drinksmark>drinksmarkList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        drinksmarkList =new ArrayList<>();

        Drinksmark turkKahve=new Drinksmark("Türk Kahvesi","Yemen'de ilk kez 13. yüzyılda fırınlanan kahvenin ortaya çıkışı da keçilerini otlatmaya götüren bir çobanın yorgun ve uyuşuk keçilerinin kahve ağacının meyvelerini yemesi ve canlanmasına dayanır. Çobanın bu durumu fark etmesiyle de kahve ağacının canlandırıcı ve rahatlatıcı meyveleri yayılmış olur.", R.drawable.turk);
        Drinksmark frappe=new Drinksmark("Frappe","Bu kahve türü ilk olarak 1957 yılında Selanik'te bir firmanın çocuklara yönelik suya karıştırılan çikolatalı bir içecek tanıtımı yaptığı sırada ortaya çıkmıştır. Bu tanıtımda bir firma çalışanının soğuk suya aynı firmanın hazır kahvesini karıştırması frappenin doğmasına sebep olmuştur.",R.drawable.frappe);
        Drinksmark affogato=new Drinksmark("Affogato","Affogato kahvenin nasıl ortaya çıktığı kesin olarak bilinmez. Fakat dünya çapında yayılmasının tarihi 1900’lerin sonlarına denk gelir. Dondurmalı espresso olarak da bilinir. Aslında bir tatlı olarak görülse de, İtalya’daki bazı restoran ve kafeler hala Affogato’yu bir içecek olarak sınıflandırır.", R.drawable.affogato);
        Drinksmark espresso=new Drinksmark("Espresso","1820 yılında Fransız Bernard Rabaout tarafından keşfedildi. Kaynayan su buharının kahveden geçirilmesi ile elde edilen bu yöntem, kısa süre içerisinde kahve piyasasında kullanılır hale geldi.",R.drawable.espresso);

        drinksmarkList.add(turkKahve);
        drinksmarkList.add(frappe);
        drinksmarkList.add(affogato);
        drinksmarkList.add(espresso);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DrinksmarkAdapter drinksmarkAdapter=new DrinksmarkAdapter(drinksmarkList);
        binding.recyclerView.setAdapter(drinksmarkAdapter);


    }
} 