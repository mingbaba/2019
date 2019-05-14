package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewActivity extends Activity {
    private TextView tex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity);
        tex=findViewById(R.id.tex);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String a=bundle.getString("aaa");
        tex.setText(a);
    }


    public void aaad(View view) {
    }
}
