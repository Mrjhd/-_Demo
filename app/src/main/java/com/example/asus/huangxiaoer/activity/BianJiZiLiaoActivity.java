package com.example.asus.huangxiaoer.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.asus.huangxiaoer.R;

public class BianJiZiLiaoActivity extends AppCompatActivity {

    private ImageView image_touxiang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bian_ji_zi_liao );
        image_touxiang = findViewById( R.id.image_touxiang );

        image_touxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
