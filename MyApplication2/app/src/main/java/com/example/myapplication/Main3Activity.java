package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {
    private ImageView[] img=new ImageView[12];
    private int [] imagepath=new int[]{
            R.drawable.img01,
            R.drawable.img02,
            R.drawable.img03,
            R.drawable.img04,
            R.drawable.img05,
            R.drawable.img06,
            R.drawable.img07,
            R.drawable.img08,
            R.drawable.img09,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        GridLayout gridLayout=findViewById(R.id.layout);
        for (int i=0;i<imagepath.length;i++){
            img[i]=new ImageView(Main3Activity.this);
            img[i].setImageResource(imagepath[i]);
            img[i].setPadding(2,2,2,2);
            ViewGroup .LayoutParams layoutParams=new ViewGroup.LayoutParams(116,68);
            img[i].setLayoutParams(layoutParams);
            gridLayout.addView(img[i]);
        }
    }
}
