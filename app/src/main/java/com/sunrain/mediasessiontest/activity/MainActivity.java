package com.sunrain.mediasessiontest.activity;

import android.os.Bundle;

import com.sunrain.mediasessiontest.R;
import com.sunrain.mediasessiontest.activity.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
    }
}
