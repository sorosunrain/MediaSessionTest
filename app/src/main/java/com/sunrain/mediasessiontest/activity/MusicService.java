package com.sunrain.mediasessiontest.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserServiceCompat;
import android.util.Log;

import java.util.List;

/**
 * @author WeiPeng
 * @version 1.0
 * @title MusicService.java
 * @description 该类主要功能描述
 * @company 北京奔流网络信息技术有限公司
 * @created 2016/09/09 13:48
 * @changeRecord [修改记录] <br/>
 */

public class MusicService extends MediaBrowserServiceCompat {

    private static final String TAG = "MusicService";

    public static final String BROWSER_ROOT_ID = "_MusicService_";

    @Nullable
    @Override
    public BrowserRoot onGetRoot(@NonNull String clientPackageName, int clientUid, @Nullable Bundle rootHints) {
        Log.w(TAG, "___onGetRoot");
        return new BrowserRoot(BROWSER_ROOT_ID,null);
    }

    @Override
    public void onLoadChildren(@NonNull String parentId, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result) {
        Log.w(TAG, "___onLoadChildren");
        result.detach();
    }
}
