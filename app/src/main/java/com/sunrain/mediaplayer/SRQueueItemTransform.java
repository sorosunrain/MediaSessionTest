package com.sunrain.mediaplayer;


import android.util.Log;

import java.util.List;

public class SRQueueItemTransform{

    private static final String TAG = "SRQueueItemTransform";

    public List transform(List mediaData){

        Log.e(TAG,"============================\nDon't call super.transform(). Just return your mediaData.");

        return null;
    }




}
