package com.example.asus.huangxiaoer.utils;


import com.example.asus.huangxiaoer.bean.CanBean;

import io.reactivex.Observable;
import retrofit2.http.GET;


public interface Api3 {

    @GET("v1/restaurant/32")
    Observable<CanBean> getCanBean();

}
