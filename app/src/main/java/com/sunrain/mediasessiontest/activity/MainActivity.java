package com.sunrain.mediasessiontest.activity;

import android.os.Bundle;
import android.util.Log;

import com.sunrain.mediaplayer.SRMediaPlayerClient;
import com.sunrain.mediaplayer.listener.SRMediaPlayerClientListener;
import com.sunrain.mediasessiontest.R;
import com.sunrain.mediasessiontest.activity.base.BaseActivity;

public class MainActivity extends BaseActivity implements SRMediaPlayerClientListener {

    private static final String TAG = "MainActivity";

    SRMediaPlayerClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        client = SRMediaPlayerClient.getInstance(this, this);
    }


    @Override
    public void onConnected() {
        Log.w(TAG, "onConnected");
    }
}
