package com.example.soporte.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class splash extends AppCompatActivity implements View.OnClickListener {

    Button btn_ver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        btn_ver = (Button)findViewById(R.id.btn_ver);
        btn_ver.setOnClickListener(this);
    }

    /*
    @Override
   protected void onStart() {
        super.onStart();
        startActivity(new Intent(this, Main3Activity.class));
    }*/


    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, Main3Activity.class));
    }
}
