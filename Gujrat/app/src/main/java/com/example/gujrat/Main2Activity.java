package com.example.gujrat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Handler handler=new Handler();
        handler.postDelayed((new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        }),500);
    }

    public void citizen(View view) {
    }

    public void municipality(View view) {
    }

    public void police(View view) {
    }

    public void labassistant(View view) {
    }

    public void hospital(View view) {
    }

    public void login(View view) {
    }

    public void hundred(View view) {
    }

    public void onezerosevenfive(View view) {
    }
}
