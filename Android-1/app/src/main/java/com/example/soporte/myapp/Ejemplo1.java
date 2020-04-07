package com.example.soporte.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejemplo1 extends AppCompatActivity implements View.OnClickListener{
    Button boton;
    Button boton2;
    EditText campo1;
    EditText campo2;
    EditText email;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplo);

        boton = (Button)findViewById(R.id.button);
        boton2 = (Button)findViewById(R.id.button2);

        campo1 = (EditText)findViewById(R.id.valor1);
        campo2 = (EditText)findViewById(R.id.valor2);

        texto = (TextView)findViewById(R.id.textView);

        boton.setOnClickListener(this);
        boton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
       if(boton.getId() == id){
           texto.setText(Integer.parseInt(campo1.getText().toString()) + Integer.parseInt(campo2.getText().toString())+"");
       }
        if(boton2.getId() == id){
            texto.setText(Integer.parseInt(campo1.getText().toString()) - Integer.parseInt(campo2.getText().toString())+"");
        }
    }
}
