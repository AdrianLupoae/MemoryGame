package com.example.memorygame;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button button2=findViewById(R.id.button2);
button2.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v)
            {
                Intent intent= new Intent(MainActivity.this, FirstFragment.class);
                startActivity(intent);
            }
        });


    }
}