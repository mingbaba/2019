package com.example.android_study;



import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.b1);
        Button b2=findViewById(R.id.b2);
        Button b3=findViewById(R.id.b3);
        b1.setOnClickListener(l);
        b2.setOnClickListener(l);
        b3.setOnClickListener(l);

    }
    View.OnClickListener l=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            Fragment f=null;
            switch (v.getId()){
                case R.id.b1:
                    f=new Me_fragment();
                    break;
                case R.id.b2:
                    f=new Find_Fragment();
                    break;
                case R.id.b3:
                    f=new Message_Fragment();
                    break;
                default:
                    break;
            }
            ft.replace(R.id.fragment,f);
            ft.commit();
        }
    };


}
