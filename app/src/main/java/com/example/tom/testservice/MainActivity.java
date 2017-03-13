package com.example.tom.testservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onCLick(View v){
        Intent intent = new Intent(this,Delay.class);
        startService(intent);
    }
    public void onclick2(View v){
        Intent intent = new Intent(this,Delay.class);
        stopService(intent);
    }

}
