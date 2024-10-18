package com.example.livroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class Page1Activity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        // Configuração do Drawer (menu lateral)
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);

        // Configura o clique na imagem para abrir o menu
        ImageView imageView = findViewById(R.id.imageView17);
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
                    startActivity(new Intent(Page1Activity.this, Page1Activity.class));
                } else if (id == R.id.page2) {
                    startActivity(new Intent(Page1Activity.this, Page2Activity.class));
                } else if (id == R.id.page3) {
                    startActivity(new Intent(Page1Activity.this, Page3Activity.class));
                } else if (id == R.id.page4) {
                    startActivity(new Intent(Page1Activity.this, Page4Activity.class));
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
