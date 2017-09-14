package com.example.the.algorithm;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MultipleSum extends AppCompatActivity {

    private android.widget.EditText inputEdt;
    private android.widget.Button inputBtn;
    private android.widget.TextView printTxt;
    private int inputNum;
    private int sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_sum);

        this.printTxt = (TextView) findViewById(R.id.printTxt);
        this.inputBtn = (Button) findViewById(R.id.inputBtn);
        this.inputEdt = (EditText) findViewById(R.id.inputEdt);

        inputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    inputNum = Integer.parseInt(inputEdt.getText().toString());
                    sum = 0;
                    if (0 < inputNum && inputNum <= 200000) {

                        for (int i = 1; i <= inputNum; i++) {
                            if (i % 3 == 0 || i % 5 == 0) {
                                sum += i;
                            }
                        }
                        printTxt.setTextSize(30);
                        printTxt.setText(sum + "");

                        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(printTxt.getWindowToken(), 0);

                    } else {
                        Toast.makeText(MultipleSum.this, "유효한 숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                    }
                }


        });
    }
}
