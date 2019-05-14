package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        ListView listView=findViewById(R.id.listview);
        int [] imageid=new int[]{R.drawable.img01,R.drawable.img01,
                R.drawable.img01,R.drawable.img01,R.drawable.img01,
                R.drawable.img01,R.drawable.img01,R.drawable.img01,
                R.drawable.img01,};
        String[] ctype=new String[]{"1","2","3","3"
                ,"3","3","3","3","3"};
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        for (int i=0;i<imageid.length;i++){
            Map<String,Object> map=new HashMap<String, Object>();
            map.put("image",imageid[i]);
            map.put("name",ctype[i]);
            list.add(map);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(
                this,list,R.layout.main,new String[]{"name","image"},
                new int[]{R.id.title,R.id.image}

        );
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Map<String,Object> map=(Map<String,Object>)parent.getItemAtPosition(position);
                Toast.makeText(Main12Activity.this,map.toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
