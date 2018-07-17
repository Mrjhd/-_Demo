package com.example.asus.huangxiaoer.presenter;


import com.example.asus.huangxiaoer.Iview.IMDianCaiActivity;
import com.example.asus.huangxiaoer.Iview.IMDianCaiPresenter;
import com.example.asus.huangxiaoer.bean.DianCaiBean;
import com.example.asus.huangxiaoer.model.DianCaiModel;


public class DianCaiPresenter implements IMDianCaiPresenter {

    IMDianCaiActivity imDianCaiActivity;
    private final DianCaiModel model;

    public DianCaiPresenter(IMDianCaiActivity imDianCaiActivity) {
        this.imDianCaiActivity = imDianCaiActivity;
        model = new DianCaiModel( this );
    }

    public void getUrl() {
        model.getUrl();
    }


    @Override
    public void diancai(DianCaiBean bean) {
        imDianCaiActivity.diancai( bean );
    }

    public void data() {
        imDianCaiActivity = null;
    }
}
