package com.example.the.algorithm;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.the.algorithm.Adapter.ChattingAdapter;
import com.example.the.algorithm.data.ChattingData;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Test05Activity extends BaseActivity {

    private android.widget.ListView chattingList;
    private android.widget.EditText inputTxt;
    private android.widget.Button sendBtn;
    List<ChattingData> chattingDatas = new ArrayList<>();
    ChattingAdapter mAdapter;
    int problemNum;
    int ball = 0;
    int strike = 0;
    int inputNum = 0;
    int tryCount = 0;

    int[] problem = new int[3];
    int[] inputNumber = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test05);
        bindViews();
        setupEvents();
        setValues();
    }


    @Override
    public void setupEvents() {
        createProblemNum();

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //      Toast.makeText(mContext, "데이터를 입력합니다.", Toast.LENGTH_LONG).show();

                inputNum = Integer.parseInt(inputTxt.getText().toString());
                chattingDatas.add(new ChattingData(true, inputTxt.getText().toString()));

                for (int i = 0; i < inputNumber.length; i++) {
                    inputNumber[i] = inputNum % 10;
                    inputNum /= 10;
                }


                checkInputToproblem(inputNumber);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        String resultSTr = String.format(Locale.KOREA, "%d 스트라이크, %d 볼입니다.  %d번 시도하셨습니다.", strike, ball, tryCount);

                        chattingDatas.add(new ChattingData(false, "확인했습니다."));
                        chattingDatas.add(new ChattingData(false, resultSTr));
                        if (strike == 3) {
                            chattingDatas.add(new ChattingData(false, "축하합니다. 클리어하셨습니다."));
                            inputTxt.setEnabled(false);
                            sendBtn.setEnabled(false);
                        }

                        mAdapter.notifyDataSetChanged();
                        chattingList.smoothScrollToPosition(mAdapter.getCount() - 1);
                    }
                }, 500);


                mAdapter.notifyDataSetChanged();
                inputTxt.setText("");

                View view = Test05Activity.this.getCurrentFocus();
                if (view != null) {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }

                chattingList.smoothScrollToPosition(mAdapter.getCount() - 1);
            }
        });
    }

    @Override
    public void setValues() {
        mAdapter = new ChattingAdapter(Test05Activity.this, chattingDatas);
        chattingList.setAdapter(mAdapter);
    }

    @Override
    public void bindViews() {
        this.sendBtn = (Button) findViewById(R.id.sendBtn);
        this.inputTxt = (EditText) findViewById(R.id.inputTxt);
        this.chattingList = (ListView) findViewById(R.id.chattingList);
    }

    public void createProblemNum() {
        int cnt = 0;
        while (true) {
            cnt = 0;
            problemNum = (int) (Math.random() * 900) + 100;
            while (cnt < problem.length) {
                problem[cnt] = problemNum % 10;
                problemNum /= 10;
                cnt++;
            }
            if (!(problem[0] == problem[1] || problem[1] == problem[2] || problem[0] == problem[2] || problem[0] == 0 || problem[1] == 0 || problem[2] == 0)) {
                break;
            }
        }
    }


    public void checkInputToproblem(int[] inputNum) {
        tryCount++;
        strike = 0;
        ball = 0;
        int[] inputArray = new int[3];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputNum[i] % 10;
            inputNum[i] /= 10;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (problem[i] == inputArray[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }

    }
}
