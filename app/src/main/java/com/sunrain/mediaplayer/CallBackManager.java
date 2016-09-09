package com.sunrain.mediaplayer;

import android.support.v4.media.session.MediaSessionCompat;

public class CallBackManager {


    private MediaSessionCallback _callback;










    private final class MediaSessionCallback extends MediaSessionCompat.Callback{

    }





    public MediaSessionCallback getSessionCallback() {
        if(_callback == null)
            _callback = new MediaSessionCallback();
        return _callback;
    }
}
