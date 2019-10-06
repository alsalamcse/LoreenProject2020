package com.example.loreenproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread th=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(3*1000);
                    Intent i=new Intent(getApplication(),SignIn.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        th.start();
    }



}
