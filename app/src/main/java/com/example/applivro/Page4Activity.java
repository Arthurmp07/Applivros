package com.example.applivro;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

public class Page4Activity extends AppCompatActivity {

    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        // Configurando o ViewPager2
        viewPager2 = findViewById(R.id.viewPager2);

        // Criando uma lista de imagens para o carrossel
        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.livrocarrousel); // Substitua por suas imagens
        images.add(R.drawable.livrocarrousel__2_);
        images.add(R.drawable.livrocarrousel__3_);
        images.add(R.drawable.livrocarrousel__4_);
        images.add(R.drawable.livrocarrousel__5_);
        images.add(R.drawable.livrocarrousel__6_);
        images.add(R.drawable.livrocarrousel__7_);


        // Configurando o adaptador
        ViewPagerAdapter adapter = new ViewPagerAdapter(images);
        viewPager2.setAdapter(adapter);
    }
}
