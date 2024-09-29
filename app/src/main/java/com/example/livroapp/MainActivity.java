package com.example.livroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encontrando as ImageViews
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);
        ImageView imageView7 = findViewById(R.id.imageView7);
        ImageView imageView8 = findViewById(R.id.imageView8);

        // Definindo os onClickListeners para redirecionar para diferentes páginas
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page1Activity.class);
                startActivity(intent);
            }
        });

            // leva pra +info
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page4Activity.class);
                startActivity(intent);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page3Activity.class);
                startActivity(intent);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page2Activity.class);
                startActivity(intent);
            }
        });



    }
}
