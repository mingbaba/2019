package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Main11Activity extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        spinner=findViewById(R.id.spinner);
//        String[] ctype=new String[]{"1","2","3"};
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
//                this,android.R.layout.select_dialog_item,ctype
//        );
//        adapter.setDropDownViewResource(android.R.layout.select_dialog_item);//设置下拉样式
//        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String result=parent.getItemAtPosition(position).toString();
                Toast.makeText(Main11Activity.this,result,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
