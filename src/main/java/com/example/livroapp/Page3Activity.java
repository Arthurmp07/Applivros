package com.example.livroapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class Page3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        // Ajuste para ViewCompat e insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurar o ViewPager2
        ViewPager2 viewPager = findViewById(R.id.viewPager3);

        // Array de imagens que serão exibidas no carrossel
        int[] imageIds = {
                R.drawable.zen_na_arte_da_escrita, // Substitua com os IDs das suas imagens
                R.drawable.as_cronicas_marcanas,
                R.drawable.a_morte_eh_um_negocio_solitario,
                R.drawable.farewell_summer,
                R.drawable.ray_bradbrury,
                R.drawable.ray_bradbury_from_tge_dest_resturned,
                R.drawable.o_homem_ilustrado
        };

        // Configurar o adaptador
        ImagePagerAdapter adapter = new ImagePagerAdapter(imageIds);
        viewPager.setAdapter(adapter);
    }
}
