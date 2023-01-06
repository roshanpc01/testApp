package com.mistydevlop.testapp2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3;
Fragment frage1,frage2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      load(new BlankFragment(),0);
      b1=findViewById(R.id.butt1);
        b2=findViewById(R.id.butt2);
        b3=findViewById(R.id.butt3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        if(v==b1)
        {
           load(new BlankFragment2(),1);
        }
        else if(v==b2)
        {
            load(new BlankFragment3(),1);
        }
        else if(v==b3)
        {
            load(new BlankFragment2(), 1);
        }
    }

    public void load(Fragment ftk,int flag)
    {

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag==0)


        ft.add(R.id.frame,ftk);
        else
            ft.replace(R.id.frame,new BlankFragment2());

        ft.commit();

    }
}