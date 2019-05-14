package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Main13Activity extends AppCompatActivity {
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        linearLayout=findViewById(R.id.ll);
        LinearLayout linearLayout1=new LinearLayout(Main13Activity.this);
        linearLayout1.setOrientation(LinearLayout.VERTICAL);
        ScrollView scrollView=new ScrollView(Main13Activity.this);
        linearLayout.addView(scrollView);
        scrollView.addView(linearLayout1);
        ImageView imageView=new ImageView(Main13Activity.this);
        imageView.setImageResource(R.drawable.img01);
        linearLayout1.addView(imageView);
        TextView textView=new TextView(Main13Activity.this);
        textView.setText(R.string.nnn);
        linearLayout1.addView(textView);
        TextView textView1=new TextView(Main13Activity.this);
        textView.setText(R.string.nnn);
        linearLayout1.addView(textView1);
    }
}
