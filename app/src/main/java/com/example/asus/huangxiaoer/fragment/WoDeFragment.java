package com.example.asus.huangxiaoer.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.asus.huangxiaoer.R;
import com.example.asus.huangxiaoer.activity.BianJiZiLiaoActivity;
import com.example.asus.huangxiaoer.activity.QuanBuDingDanActivity;
import com.example.asus.huangxiaoer.activity.SettingActivity;
import com.example.asus.huangxiaoer.activity.XiHuanDeDianActivity;
import com.example.asus.huangxiaoer.activity.YouHuiJuanActivity;


public class WoDeFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.wodefragment, container, false );
        LinearLayout ll_shezhi = view.findViewById( R.id.ll_shezhi );
        LinearLayout ll_grrenziliao = view.findViewById( R.id.ll_grrenziliao );
        LinearLayout quanbudingdan = view.findViewById( R.id.quanbudingdan );
        LinearLayout ll_xihuandedian = view.findViewById( R.id.ll_xihuandedian );
        LinearLayout ll_youhuijuan = view.findViewById( R.id.ll_youhuijuan );
        ll_youhuijuan.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),YouHuiJuanActivity.class);
                startActivity( intent );
            }
        } );
        ll_xihuandedian.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),XiHuanDeDianActivity.class);
                startActivity( intent );
            }
        } );
        quanbudingdan.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),QuanBuDingDanActivity.class);
                startActivity( intent );
            }
        } );
        ll_grrenziliao.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),BianJiZiLiaoActivity.class);
                startActivity( intent );
            }
        } );
        ll_shezhi.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getActivity(), SettingActivity.class );
                startActivity( intent );
            }
        } );


        return view;
    }
}
