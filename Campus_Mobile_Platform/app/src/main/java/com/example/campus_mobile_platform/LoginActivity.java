package com.example.campus_mobile_platform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText userid,userpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Initialization();
    }

    private void Initialization() {
        userid=findViewById(R.id.userid);
        userpassword=findViewById(R.id.userpassword);
    }

    public void login(View view) {//登录按钮点击事件
    }

    public void register(View view) {//注册按钮点击事件
    }
}
