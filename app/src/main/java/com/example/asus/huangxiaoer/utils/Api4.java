package com.example.asus.huangxiaoer.utils;

import com.example.asus.huangxiaoer.bean.DateBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by 因为有个你i on 2018/7/13.
 */

public interface Api4 {
    @GET("api/checkversion.php")
    Observable<DateBean> getData();
}
