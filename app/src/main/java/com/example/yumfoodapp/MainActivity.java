package com.example.yumfoodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    Button bSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bread);
        setTitle("YUM");

        bSubmit = findViewById(R.id.bSubmit);
        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openScreen2();

            }
        });
    }

    public void openScreen2()
    {
        Intent intent = new Intent (this,Cheese.class );
        startActivity(intent);
    }
}
