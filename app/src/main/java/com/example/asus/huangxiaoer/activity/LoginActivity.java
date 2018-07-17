package com.example.asus.huangxiaoer.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.asus.huangxiaoer.R;

import java.util.Timer;
import java.util.TimerTask;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_login_yanzhengma,iv_login_yanzhengma1,daojishi_img;
    private RelativeLayout relativeLayout1,relativeLayout2,daojishi;
    private TextView tv_login_changgui;
    private int num=0;
    private int mima=0;
    private TextView daojishi_text;
    private Timer timer;
    private int size=0;
    private ImageView showmima;
    private EditText et_login_pwd2;
    private Button login;

    @SuppressLint("HandlerLeak")
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int what = msg.what;
            size=what;
            //倒计时==0时
            if(what==0)
            {
                iv_login_yanzhengma.setImageResource( R.drawable.getagain);//重新获取验证码
                daojishi.setVisibility(View.INVISIBLE);//倒计时
                daojishi_text.setText("30s后");
                timer.cancel();
                return;
            }else{
                daojishi_text.setText(what+"s后");
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        login = findViewById(R.id.login);
        login.setOnClickListener(this);
        tv_login_changgui = findViewById(R.id.tv_login_changgui);
        iv_login_yanzhengma = findViewById(R.id.iv_login_yanzhengma);
        iv_login_yanzhengma.setOnClickListener(this);
        relativeLayout1 = findViewById(R.id.relativeLayout1);
        relativeLayout2 = findViewById(R.id.relativeLayout2);
        tv_login_changgui.setOnClickListener(this);
        iv_login_yanzhengma1 = findViewById(R.id.iv_login_yanzhengma);
        daojishi=findViewById(R.id.daojishi);
        daojishi_text=findViewById(R.id.tv_daojishi);
        showmima = findViewById(R.id.showmima);
        showmima.setOnClickListener(this);
        et_login_pwd2 = findViewById(R.id.et_login_pwd2);
        showmima.setImageResource(R.drawable.hidemima);
        et_login_pwd2.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    /**
     * 点击事件
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            //切换登录方式  改变布局
            case R.id.tv_login_changgui:
                num++;
                if(num%2==1)
                {
                    relativeLayout1.setVisibility(View.INVISIBLE);
                    relativeLayout2.setVisibility(View.VISIBLE);
                    tv_login_changgui.setText("短信验证码登录方式");
                }else if(num%2==0){
                    relativeLayout2.setVisibility(View.INVISIBLE);
                    relativeLayout1.setVisibility(View.VISIBLE);
                    tv_login_changgui.setText("使用常规登录方式");
                }

                break;
            //获取验证码
            case R.id.iv_login_yanzhengma:
                if(size>0)
                {
                    //不作操作
                }
                else{
                    daojishi.setVisibility(View.VISIBLE);
                    timer = new Timer();
                    TimerTask timerTask= new TimerTask() {
                        int t=30;
                        @Override
                        public void run() {
                            t--;
                            Message msg=Message.obtain();
                            msg.what=t;
                            handler.sendMessage(msg);
                        }
                    };
                    timer.schedule(timerTask,1000,1000);
                }

                break;
            //隐藏显示密码
            case R.id.showmima:
                mima++;
                if(mima%2==0)
                {
                    //隐藏密码
                    showmima.setImageResource(R.drawable.hidemima);
                    et_login_pwd2.setTransformationMethod( PasswordTransformationMethod.getInstance());
                }
                else if(mima%2==1){
                    //显示密码
                    showmima.setImageResource(R.drawable.showmima);
                    et_login_pwd2.setTransformationMethod( HideReturnsTransformationMethod.getInstance());
                }
                break;
            case R.id.login:
                Intent intent=new Intent(LoginActivity.this,SaoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
