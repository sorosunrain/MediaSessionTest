package com.sunrain.mediaplayer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;

import com.sunrain.mediaplayer.listener.SRMediaPlayerClientListener;
import com.sunrain.mediaplayer.service.SRMusicService;

public class SRMediaPlayerClient {

    private static final String TAG = "SRMediaPlayerClient";

    public static final int FLAG_RESTART = 100;
    public static final int FLAG_COMPARE = 200;

    private static SRMediaPlayerClient _client;

    private SRMusicService.SRBinder mBinder;

    private Context mContext;
    private int mCurrentFlag = FLAG_RESTART;

    private MediaSessionCompat mMediaSession;


    private MediaControllerCompat.TransportControls mTransportControls;     //遥控器
    private SRMediaPlayerClientListener mListener;


    public void init(){

        mMediaSession = new MediaSessionCompat(mContext,TAG);
        mTransportControls = mBinder.getTransportControls(mContext,mMediaSession.getSessionToken());

        mMediaSession.setCallback(new SessionCallBack(mListener));

        mListener.onConnected();

    }

















    private SRMediaPlayerClient(Context context, SRMediaPlayerClientListener listener){
        mContext = context;
        mListener = listener;
        startService();
    }

    public static SRMediaPlayerClient getInstance(Context context, SRMediaPlayerClientListener listener) {
        if (_client == null) {
            _client = new SRMediaPlayerClient(context,listener);
        }
        return _client;
    }

    public void startService(){
        Intent intent = new Intent(mContext, SRMusicService.class);
        mContext.startService(intent);
    }



    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mBinder = (SRMusicService.SRBinder) service;
            init();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

}
