package com.example.soporte.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Bateria extends AppCompatActivity {

    TextView T;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bateria);

        T = (TextView)findViewById(R.id.result);
        registerReceiver(this.recibir, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    BroadcastReceiver recibir = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            T.setText(level+"");
        }
    };
}
