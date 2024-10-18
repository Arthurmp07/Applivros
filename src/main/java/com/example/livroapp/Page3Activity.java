package com.example.livroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.navigation.NavigationView;

public class Page3Activity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        // Configuração do Drawer (menu lateral)
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);

        // Configura o clique na imagem para abrir o menu
        ImageView imageView = findViewById(R.id.imageView16);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        // Lida com os cliques nas opções do menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.page1) {
                    startActivity(new Intent(Page3Activity.this, Page1Activity.class));
                } else if (id == R.id.page2) {
                    startActivity(new Intent(Page3Activity.this, Page2Activity.class));
                } else if (id == R.id.page3) {
                    startActivity(new Intent(Page3Activity.this, Page3Activity.class));
                } else if (id == R.id.page4) {
                    startActivity(new Intent(Page3Activity.this, Page4Activity.class));
                }else if (id == R.id.home) {
                    startActivity(new Intent(Page3Activity.this, MainActivity.class));
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

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
                R.drawable.linhadotempo1,
                R.drawable.linhadotempo2,
                R.drawable.linhadotempo3,
                R.drawable.linhadotempo4,
                R.drawable.linhadotempo5,
                R.drawable.linhadotempo6,
                R.drawable.linhadotempo7,
                R.drawable.linhadotempo8,
                R.drawable.linhadotempo9
        };

        // Configurar o adaptador
        ImagePagerAdapter adapter = new ImagePagerAdapter(imageIds);
        viewPager.setAdapter(adapter);
    }
}
