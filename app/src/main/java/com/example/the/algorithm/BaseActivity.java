package com.example.the.algorithm;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by the on 2017-08-11.
 */

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void bindViews();

    public abstract void setupEvents();

    public abstract void setValues();

}


