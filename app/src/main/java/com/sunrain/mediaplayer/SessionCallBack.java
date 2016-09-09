package com.sunrain.mediaplayer;


import android.support.v4.media.session.MediaSessionCompat;

import com.sunrain.mediaplayer.listener.SRMediaPlayerClientListener;

public class SessionCallBack extends MediaSessionCompat.Callback {






















    private SRMediaPlayerClientListener listener = null;

    public SessionCallBack(SRMediaPlayerClientListener listener) {
        this.listener = listener;
    }
}
