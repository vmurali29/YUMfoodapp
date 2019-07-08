package com.example.yumfoodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class favorites extends AppCompatActivity {

    Button button2;
    Button button3;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.favorites);
            button2 = findViewById(R.id.button2);
            button3 = findViewById(R.id.button3);
            button2.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(favorites.this, MainActivity.class);
                    startActivity(intent);

                }

                });
            button3.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent (favorites.this,ordernow.class);
                    startActivity(intent2);
                }
            });


        }


    }
