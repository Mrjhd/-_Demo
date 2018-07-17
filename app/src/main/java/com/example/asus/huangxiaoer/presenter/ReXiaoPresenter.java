package com.example.asus.huangxiaoer.presenter;

import com.example.asus.huangxiaoer.Iview.IMReXiaoActivity;
import com.example.asus.huangxiaoer.Iview.IMReXiaoPresnter;
import com.example.asus.huangxiaoer.bean.ReXiaoBean;
import com.example.asus.huangxiaoer.model.ReXiaoModel;


public class ReXiaoPresenter implements IMReXiaoPresnter {
    IMReXiaoActivity imReXiaoActivity;
    private final ReXiaoModel model;

    public ReXiaoPresenter(IMReXiaoActivity imReXiaoActivity) {

        this.imReXiaoActivity = imReXiaoActivity;
        model = new ReXiaoModel( this );
    }

    public void getUrl() {
        model.getUrl();
    }

    @Override
    public void rexiao(ReXiaoBean bean) {
      imReXiaoActivity.rexiao( bean );
    }
}
