package com.sunrain.mediasessiontest;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * @author WeiPeng
 * @version 1.0
 * @title MyApplication.java
 * @description 该类主要功能描述
 * @company 北京奔流网络信息技术有限公司
 * @created 2016/09/09 11:52
 * @changeRecord [修改记录] <br/>
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
