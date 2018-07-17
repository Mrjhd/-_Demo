package com.example.asus.huangxiaoer.presenter;

import com.example.asus.huangxiaoer.Iview.IView;
import com.example.asus.huangxiaoer.bean.DateBean;
import com.example.asus.huangxiaoer.model.DateModel;

/**
 * Created by 因为有个你i on 2018/7/13.
 */

public class DatePresenter implements IPresenter<DateBean> {

    IView iView;
    private DatePresenter dataPresenter;
    private DateModel dataModel;

    public DatePresenter(IView iView){
        this.iView=iView;
    }
    public void getData(){
        dataModel = new DateModel(this);
        dataModel.getData();
    }
    @Override
    public void OnReceiver(DateBean dateBean) {
        iView.OnSuccess(dateBean);

    }
}
