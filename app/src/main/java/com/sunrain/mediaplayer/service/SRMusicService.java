package com.sunrain.mediaplayer.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserServiceCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

import com.sunrain.Constant;

import java.util.List;

public class SRMusicService extends MediaBrowserServiceCompat {

    private static final String TAG = "SRMusicService";
    public static final String BROWSER_ROOT_ID = "_MusicService_";

    @Override
    public void onCreate() {
        super.onCreate();

        Log.e(TAG, "onCreate");


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        MediaSessionCompat.Token token = intent.getParcelableExtra("token");

        setSessionToken(token);

        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(Constant.ACTION_STARTED));

        return super.onStartCommand(intent, flags, startId);
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




}
