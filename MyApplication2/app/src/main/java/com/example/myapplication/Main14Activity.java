package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main14Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        Log.i("Activity生命周期","onCreate方法调用");
    }

    public void aaa(View view) {
        String a="asdffffgggg";
        Intent intent=new Intent(Main14Activity.this,NewActivity.class);
        Bundle bundle=new Bundle();
        bundle.putCharSequence("aaa",a);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
