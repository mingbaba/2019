package com.example.myapplication;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;

public class Main6Activity extends AppCompatActivity {
    Chronometer chronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        chronometer=findViewById(R.id.ch);
        chronometer.setBase(SystemClock.elapsedRealtime());//获取系统时间
        chronometer.setFormat("%s");
        chronometer.start();
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if (SystemClock.elapsedRealtime()-chronometer.getBase()>=60000){
                    chronometer.stop();
                }
            }
        });
    }
}
