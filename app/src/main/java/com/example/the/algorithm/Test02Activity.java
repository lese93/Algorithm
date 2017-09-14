package com.example.the.algorithm;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Test02Activity extends AppCompatActivity {

    private EditText inputEdt;
    private android.widget.Button inputBtn;
    private android.widget.Button Btn1;
    private android.widget.Button Btn2;
    private android.widget.Button Btn3;
    private android.widget.Button Btn4;
    private android.widget.TextView printTxt;
    private int inputNum = 0;
    private String result;
    private Button clearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test02);


        bindView();
        setupEvents();
    }

    private void setupEvents() {


        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum = Integer.parseInt(inputEdt.getText().toString());
                result = "";
                printTxt.setGravity(Gravity.LEFT);
                if (0 < inputNum && inputNum <= 30) {
                    for (int i = 1; i <= inputNum; i++) {
                        for (int y = 1; y <= i; y++) {

                            result += "*";
                        }
                        result += "\n";
                    }
                    printTxt.setText(result);
                }
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(printTxt.getWindowToken(), 0);


            }

        });


        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum = Integer.parseInt(inputEdt.getText().toString());
                result = "";
                printTxt.setGravity(Gravity.RIGHT);
                if (0 < inputNum && inputNum <= 30) {

                    for (int i = 1; i <= inputNum; i++) {
                        for (int y = 1; y <= i; y++) {

                            result += "*";
                        }
                        result += "\n";
                    }
                    printTxt.setText(result);
                }
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(printTxt.getWindowToken(), 0);
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum = Integer.parseInt(inputEdt.getText().toString());
                result = "";
                printTxt.setGravity(Gravity.LEFT);
                if (0 < inputNum && inputNum <= 30) {

                    for (int i = 1; i <= inputNum; i++) {
                        for (int y = inputNum; y >= i; y--) {

                            result += "*";
                        }
                        result += "\n";
                    }
                    printTxt.setText(result);
                }
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(printTxt.getWindowToken(), 0);
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum = Integer.parseInt(inputEdt.getText().toString());
                result = "";
                printTxt.setGravity(Gravity.RIGHT);
                if (0 < inputNum && inputNum <= 30) {

                    for (int i = 1; i <= inputNum; i++) {
                        for (int y = inputNum; y >= i; y--) {

                            result += "*";
                        }
                        result += "\n";
                    }
                    printTxt.setText(result);
                }
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(printTxt.getWindowToken(), 0);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printTxt.setText("");
                result = "";
            }
        });

    }

    private void bindView() {
        this.printTxt = (TextView) findViewById(R.id.printTxt);
        this.Btn4 = (Button) findViewById(R.id.Btn4);
        this.Btn3 = (Button) findViewById(R.id.Btn3);
        this.Btn2 = (Button) findViewById(R.id.Btn2);
        this.Btn1 = (Button) findViewById(R.id.Btn1);
        this.clearBtn = (Button) findViewById(R.id.clearBtn);
        this.inputEdt = (EditText) findViewById(R.id.inputEdt);
    }
}
