package com.example.asus.huangxiaoer.model;

import com.example.asus.huangxiaoer.bean.DateBean;
import com.example.asus.huangxiaoer.presenter.IPresenter;
import com.example.asus.huangxiaoer.utils.RetrofitUtils4;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 因为有个你i on 2018/7/13.
 */

public class DateModel {
    IPresenter iPresenter;
    public DateModel(IPresenter iPresenter){
        this.iPresenter=iPresenter;
    }
    public void getData(){
        RetrofitUtils4.getInstance().getService()
                .getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DateBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(DateBean dateBean) {

                        iPresenter.OnReceiver(dateBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
