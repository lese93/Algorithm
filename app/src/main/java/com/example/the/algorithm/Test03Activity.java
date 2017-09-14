package com.example.the.algorithm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.the.algorithm.Adapter.GuguAdapter;
import com.example.the.algorithm.data.GuguData;

import java.util.ArrayList;
import java.util.List;

public class Test03Activity extends AppCompatActivity {

    private android.widget.Button multiply2;
    private android.widget.Button multiply3;
    private android.widget.Button multiply4;
    private android.widget.Button multiply5;
    private android.widget.Button multiply6;
    private android.widget.Button multiply7;
    private android.widget.Button multiply8;
    private android.widget.Button multiply9;
    private android.widget.Button multiplyWhole;
    ListView guguList;
    List<GuguData> guguDatas = new ArrayList<>();
    GuguAdapter guguAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test03);

        bindViews();
        setupEvents();
        setValues();

    }

    private void setValues() {

        guguAdapter = new GuguAdapter(Test03Activity.this, guguDatas);
        guguList.setAdapter(guguAdapter);
    }

    private void setupEvents() {

        View.OnClickListener guguLitener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(v.getTag().toString()) == 10) {
                    gugudan();
                } else {
                    guguCal(Integer.parseInt(v.getTag().toString()));
                }
            }
        };


        multiply2.setOnClickListener(guguLitener);
        multiply3.setOnClickListener(guguLitener);
        multiply4.setOnClickListener(guguLitener);
        multiply5.setOnClickListener(guguLitener);
        multiply6.setOnClickListener(guguLitener);
        multiply7.setOnClickListener(guguLitener);
        multiply8.setOnClickListener(guguLitener);
        multiply9.setOnClickListener(guguLitener);
        multiplyWhole.setOnClickListener(guguLitener);

    }

    private void guguCal(int num) {
        guguDatas.clear();
        for (int i = 1; i <= 9; i++) {
            guguDatas.add(new GuguData(num, i));
        }
        guguAdapter.notifyDataSetChanged();
    }

    private void gugudan() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                guguDatas.add(new GuguData(i, j));
            }
        }
        guguAdapter.notifyDataSetChanged();
    }


    private void bindViews() {
        this.guguList = (ListView) findViewById(R.id.guguList);
        this.multiplyWhole = (Button) findViewById(R.id.multiplyWhole);
        this.multiply9 = (Button) findViewById(R.id.multiply9);
        this.multiply8 = (Button) findViewById(R.id.multiply8);
        this.multiply7 = (Button) findViewById(R.id.multiply7);
        this.multiply6 = (Button) findViewById(R.id.multiply6);
        this.multiply5 = (Button) findViewById(R.id.multiply5);
        this.multiply4 = (Button) findViewById(R.id.multiply4);
        this.multiply3 = (Button) findViewById(R.id.multiply3);
        this.multiply2 = (Button) findViewById(R.id.multiply2);
    }
}
