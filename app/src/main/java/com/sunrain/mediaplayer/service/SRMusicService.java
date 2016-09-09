package com.sunrain.mediaplayer.service;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserServiceCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

import java.util.List;

public class SRMusicService extends MediaBrowserServiceCompat {

    private static final String TAG = "SRMusicService";
    public static final String BROWSER_ROOT_ID = "_MusicService_";

    private SRBinder mBinder;


    @Override
    public void onCreate() {
        super.onCreate();

        Log.e(TAG, "onCreate");


    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.e(TAG, "onBind");
        if (mBinder == null)
            mBinder = new SRBinder();
        return mBinder;
    }

    @Nullable
    @Override
    public BrowserRoot onGetRoot(@NonNull String clientPackageName, int clientUid, @Nullable Bundle rootHints) {
        Log.w(TAG, "___onGetRoot");
        return new BrowserRoot(BROWSER_ROOT_ID, null);
    }

    @Override
    public void onLoadChildren(@NonNull String parentId, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result) {
        Log.w(TAG, "___onLoadChildren");
        result.detach();
    }


    public final class SRBinder extends Binder {

        public MediaControllerCompat.TransportControls getTransportControls(Context mContext, MediaSessionCompat.Token token) {

            try {
                setSessionToken(token);
                MediaControllerCompat controller = new MediaControllerCompat(mContext, token);
                return controller.getTransportControls();
            } catch (Exception e) {
            }

            return null;
        }
    }





}
