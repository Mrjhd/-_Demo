package com.example.asus.huangxiaoer.utils;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 因为有个你i on 2018/7/13.
 */

public class RetrofitUtils4 {
    private static  volatile RetrofitUtils4 instance;
    private final Retrofit retrofit;

    private RetrofitUtils4(){
        //日志拦截器
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(ServiceUrl.BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static RetrofitUtils4 getInstance(){
        if(instance==null){
            synchronized (RetrofitUtils4.class){
                if(null==instance){
                    instance=new RetrofitUtils4();
                }
            }
        }
        return instance;
    }

    public Api4 getService(){
        return retrofit.create(Api4.class);
    }
}

