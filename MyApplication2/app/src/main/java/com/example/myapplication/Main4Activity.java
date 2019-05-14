package com.example.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Main4Activity extends Activity {
    int year,month,day;
    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        datePicker=findViewById(R.id.datepicker);
        Calendar calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        day=calendar.get(Calendar.DAY_OF_MONTH);
        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Main4Activity.this.year=year;
                Main4Activity.this.month=monthOfYear;
                Main4Activity.this.day=dayOfMonth;
                show(year,month,day);
            }
        });
    }
    private void show(int year,int mount,int day){
        String s=year+"年"+(mount+1)+"月"+day+"日";
        Toast.makeText(Main4Activity.this,s,Toast.LENGTH_SHORT).show();
    }
}
