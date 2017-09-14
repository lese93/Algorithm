package com.example.the.algorithm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Test04Activity extends AppCompatActivity {

    private android.widget.Button checkAllBtn;
    private android.widget.Button crossBtn;
    private android.widget.Button borderBtn;
    private android.widget.Button initBtn;
    private android.widget.Button bingoBtn;
    private android.widget.CheckBox cb1;
    private android.widget.CheckBox cb2;
    private android.widget.CheckBox cb3;
    private android.widget.CheckBox cb4;
    private android.widget.CheckBox cb5;
    private android.widget.CheckBox cb6;
    private android.widget.CheckBox cb7;
    private android.widget.CheckBox cb8;
    private android.widget.CheckBox cb9;
    private android.widget.CheckBox cb10;
    private android.widget.CheckBox cb11;
    private android.widget.CheckBox cb12;
    private android.widget.CheckBox cb13;
    private android.widget.CheckBox cb14;
    private android.widget.CheckBox cb15;
    private android.widget.CheckBox cb16;
    private android.widget.CheckBox cb17;
    private android.widget.CheckBox cb18;
    private android.widget.CheckBox cb19;
    private android.widget.CheckBox cb20;
    private android.widget.CheckBox cb21;
    private android.widget.CheckBox cb22;
    private android.widget.CheckBox cb23;
    private android.widget.CheckBox cb24;
    private android.widget.CheckBox cb25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test04);

        bindView();
        setupEvents();

    }

    private void setupEvents() {

        final CheckBox[][] boxes =
                {
                        {cb1, cb2, cb3, cb4, cb5},
                        {cb6, cb7, cb8, cb9, cb10},
                        {cb11, cb12, cb13, cb14, cb15},
                        {cb16, cb17, cb18, cb19, cb20},
                        {cb21, cb22, cb23, cb24, cb25}
                };

        bingoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int horizonCheckCnt = 0;
                int verticalCheckCnt = 0;
                int leftCrossCheckCnt = 0;
                int rightCrossCheckCnt = 0;
                int bingoCnt = 0;

                for (int i = 0; i < boxes.length; i++, horizonCheckCnt = 0, verticalCheckCnt = 0) {
                    for (int j = 0; j < boxes.length; j++) {
                        if (boxes[i][j].isChecked()) {
                            horizonCheckCnt++;
                            if (horizonCheckCnt == 5) {
                                bingoCnt++;
                                horizonCheckCnt = 0;
                            }
                        }
                        if (boxes[j][i].isChecked()) {
                            verticalCheckCnt++;
                            if (verticalCheckCnt == 5) {
                                bingoCnt++;
                                verticalCheckCnt = 0;
                            }
                        }
                        if (i == j && boxes[i][j].isChecked()) {
                            leftCrossCheckCnt++;
                            if (leftCrossCheckCnt == 5) {
                                bingoCnt++;
                                leftCrossCheckCnt = 0;
                            }
                        }
                        if (i + j == 4 && boxes[j][i].isChecked()) {
                            rightCrossCheckCnt++;
                            if (rightCrossCheckCnt == 5) {
                                bingoCnt++;
                                rightCrossCheckCnt = 0;
                            }
                        }

                    }
                }

                Toast.makeText(Test04Activity.this, bingoCnt + " 빙고", Toast.LENGTH_LONG).show();
            }
        });


        checkAllBtn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < boxes.length; i++) {
                    for (int j = 0; j < boxes.length; j++) {
                        boxes[i][j].setChecked(true);
                    }
                }
            }
        });

        crossBtn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < boxes.length; i++) {
                    for (int j = 0; j < boxes.length; j++) {
                        boxes[i][j].setChecked(false);
                    }
                }
                for (int i = 0; i < boxes.length; i++) {
                    for (int j = 0; j < boxes.length; j++) {
                        if (i == j || i + j == 4) {
                            boxes[i][j].setChecked(true);
                        }
                    }
                }
            }
        });

        borderBtn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < boxes.length; i++) {
                    for (int j = 0; j < boxes.length; j++) {
                        boxes[i][j].setChecked(false);
                    }
                }
                for (int i = 0; i < boxes.length; i++) {
                    for (int j = 0; j < boxes.length; j++) {
                        if (i == 0 || j == 0 || i == 4 || j == 4) {
                            boxes[i][j].setChecked(true);
                        }
                    }
                }
            }
        });


        initBtn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < boxes.length; i++) {
                    for (int j = 0; j < boxes.length; j++) {
                        boxes[i][j].setChecked(false);
                    }
                }
            }
        });
    }

    private void bindView() {
        this.cb25 = (CheckBox) findViewById(R.id.cb25);
        this.cb24 = (CheckBox) findViewById(R.id.cb24);
        this.cb23 = (CheckBox) findViewById(R.id.cb23);
        this.cb22 = (CheckBox) findViewById(R.id.cb22);
        this.cb21 = (CheckBox) findViewById(R.id.cb21);
        this.cb20 = (CheckBox) findViewById(R.id.cb20);
        this.cb19 = (CheckBox) findViewById(R.id.cb19);
        this.cb18 = (CheckBox) findViewById(R.id.cb18);
        this.cb17 = (CheckBox) findViewById(R.id.cb17);
        this.cb16 = (CheckBox) findViewById(R.id.cb16);
        this.cb15 = (CheckBox) findViewById(R.id.cb15);
        this.cb14 = (CheckBox) findViewById(R.id.cb14);
        this.cb13 = (CheckBox) findViewById(R.id.cb13);
        this.cb12 = (CheckBox) findViewById(R.id.cb12);
        this.cb11 = (CheckBox) findViewById(R.id.cb11);
        this.cb10 = (CheckBox) findViewById(R.id.cb10);
        this.cb9 = (CheckBox) findViewById(R.id.cb9);
        this.cb8 = (CheckBox) findViewById(R.id.cb8);
        this.cb7 = (CheckBox) findViewById(R.id.cb7);
        this.cb6 = (CheckBox) findViewById(R.id.cb6);
        this.cb5 = (CheckBox) findViewById(R.id.cb5);
        this.cb4 = (CheckBox) findViewById(R.id.cb4);
        this.cb3 = (CheckBox) findViewById(R.id.cb3);
        this.cb2 = (CheckBox) findViewById(R.id.cb2);
        this.cb1 = (CheckBox) findViewById(R.id.cb1);
        this.initBtn = (Button) findViewById(R.id.initBtn);
        this.borderBtn = (Button) findViewById(R.id.borderBtn);
        this.crossBtn = (Button) findViewById(R.id.crossBtn);
        this.checkAllBtn = (Button) findViewById(R.id.checkAllBtn);
        this.bingoBtn = (Button) findViewById(R.id.bingoBtn);
    }


}
