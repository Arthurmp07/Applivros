package com.example.livroapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configuração do Toolbar e do Menu Retrátil
        drawerLayout = findViewById(R.id.drawer_layout);
        @SuppressLint("MissingInflatedId") Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // ImageViews para redirecionamento
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);
        ImageView imageView7 = findViewById(R.id.imageView7);
        ImageView imageView8 = findViewById(R.id.imageView8);

        // Redirecionamentos
        imageView2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Page3Activity.class)));
        imageView5.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Page4Activity.class)));
        imageView6.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Page1Activity.class)));
        imageView7.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Page2Activity.class)));
    }
}
