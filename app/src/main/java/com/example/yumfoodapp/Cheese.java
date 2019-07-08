package com.example.yumfoodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cheese extends AppCompatActivity {

    Button bDressing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cheese);
        setTitle("YUM");


        bDressing = findViewById(R.id.bDressing);
        bDressing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openScreen4();
            }
        });


    }

    public void openScreen4()
    {
        Intent intent = new Intent (this,Main2Activity.class );
        startActivity(intent);
    }
};
