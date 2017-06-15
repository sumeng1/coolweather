package com.coolweather.android.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/5/23.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        Log.d("test","sendOkHttpRequest---"+address);

        OkHttpClient okHttpClient=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
