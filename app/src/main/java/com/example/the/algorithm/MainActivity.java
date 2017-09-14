package com.example.the.algorithm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Btn1;
    private Button Btn2;
    private Button Btn3;
    private Button Btn4;
    private Button Btn5;
    private Button Btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
        setupEvents();
    }


    private void bindView() {
        this.Btn6 = (Button) findViewById(R.id.Btn6);
        this.Btn5 = (Button) findViewById(R.id.Btn5);
        this.Btn4 = (Button) findViewById(R.id.Btn4);
        this.Btn3 = (Button) findViewById(R.id.Btn3);
        this.Btn2 = (Button) findViewById(R.id.Btn2);
        this.Btn1 = (Button) findViewById(R.id.Btn1);
    }

    private void setupEvents() {
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MultipleSum.class);
                startActivity(intent);
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test02Activity.class);
                startActivity(intent);
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test03Activity.class);
                startActivity(intent);
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test04Activity.class);
                startActivity(intent);
            }
        });

        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test05Activity.class);
                startActivity(intent);
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test06Activity.class);
                startActivity(intent);
            }
        });
    }
}
