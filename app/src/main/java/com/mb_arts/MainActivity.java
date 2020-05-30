package com.mb_arts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.m.customtoast.CT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CT.success(getApplicationContext(),"Your Text here");

//           CT.normal(getApplicationContext(),"Your Text here");
//           CT.normal2(getApplicationContext(),"Your Text here");
//           CT.success(getApplicationContext(),"Your Text here");
//           CT.success2(getApplicationContext(),"Your Text here");
//           CT.loading(getApplicationContext(),"Your Text here");
//           CT.loading2(getApplicationContext(),"Your Text here");
    }
}
