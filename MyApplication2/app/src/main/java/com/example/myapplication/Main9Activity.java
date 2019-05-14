package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Main9Activity extends AppCompatActivity {
    private int[] picture=new int[]{
            R.drawable.img01, R.drawable.img02,R.drawable.img03,R.drawable.img04,R.drawable.img05,
            R.drawable.img06,R.drawable.img07
    };
    private ImageSwitcher imageSwitcher;
    private int index;
    private float touchDownX;
    private float touchupx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        imageSwitcher=findViewById(R.id.imsw);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(Main9Activity.this);
                imageView.setImageResource(picture[index]);
                return imageView;
            }
        });
        imageSwitcher.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    touchDownX=event.getX();
                    return true;
                }else if(event.getAction()==MotionEvent.ACTION_UP){
                    touchupx=event.getX();
                    if (touchupx-touchDownX>100){
                        index=index==0?picture.length-1:index-1;

                    }
                    return true;
                }
                return false;
            }
        });
    }
}
