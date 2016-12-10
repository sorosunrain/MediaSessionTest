package com.sunrain;


public class Constant {

    public static final String ACTION_STARTED = "com.sunrain.player.service.started";

    private static final String url = "http://search.dongting.com/song/search/old/v2/?size=%d&page=%d&q=%s";
    private static final int normalSize = 50;

    public static final String getUrl(String search){
        return getUrl(normalSize,1,search);
    }

    public static final String getUrl(int page, String search){
        return getUrl(normalSize,page,search);
    }

    public static final String getUrl(int pageSize, int page, String search){
        return String.format(url,pageSize,page,search);
    }

}
