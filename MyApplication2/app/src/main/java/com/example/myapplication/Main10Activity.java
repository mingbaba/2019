package com.example.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//p61
public class Main10Activity extends AppCompatActivity {
    private int[] picture=new int[]{
            R.drawable.img01, R.drawable.img02,R.drawable.img03,R.drawable.img04,R.drawable.img05,
            R.drawable.img06,R.drawable.img07
            ,R.drawable.img08,R.drawable.img09,
            R.drawable.img08,R.drawable.img08,
            R.drawable.img08,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        GridView gridView=findViewById(R.id.grid);
       gridView.setAdapter(new Image(this));
    }
    public class  Image extends BaseAdapter{
        private Context mcontext;
        public Image(Context c){
            mcontext=c;
        }
        @Override
        public int getCount() {
            return picture.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            if (convertView==null){
                imageView=new ImageView(mcontext);
                imageView.setLayoutParams(new GridView.LayoutParams(100,90));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            else{
                imageView=(ImageView) convertView;
            }
            imageView.setImageResource(picture[position]);
            return imageView;
        }
    }
}
