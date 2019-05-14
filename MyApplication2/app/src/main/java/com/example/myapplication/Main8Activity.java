package com.example.myapplication;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {
    private SeekBar seekBar;
    private ImageView image;
    private RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        seekBar=findViewById(R.id.seekbar);
        image=findViewById(R.id.images);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                image.setImageAlpha(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        ratingBar=findViewById(R.id.ratingbar);
        String string= String.valueOf(ratingBar.getRating());

        Toast.makeText(Main8Activity.this,string,Toast.LENGTH_SHORT).show();
        Toast.makeText(Main8Activity.this,String.valueOf(ratingBar.getStepSize()),Toast.LENGTH_SHORT).show();
        Toast.makeText(Main8Activity.this,String.valueOf(ratingBar.getProgress()),Toast.LENGTH_SHORT).show();
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }
        });
    }
}
