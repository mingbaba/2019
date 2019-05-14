package com.example.myapplication;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int x=0;
    private Handler mhandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        progressBar=findViewById(R.id.pro);
        mhandler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                if (msg.what==0x111){
                    progressBar.setProgress(x);
                }else{
                    Toast.makeText(Main7Activity.this,"完成",Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                }
            }
        };
    new Thread(new Runnable() {
        @Override
        public void run() {
            while(true){
                x=dowork();
                Message m=new Message();
                if (x<100){
                    m.what=0x111;
                    mhandler.sendMessage(m);
                }else{
                    m.what=0x110;
                    mhandler.sendMessage(m);
                    break;
                }
            }
        }
        private  int dowork(){
            x+=Math.random()*10;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return x;
        }
    }).start();
    }
}
