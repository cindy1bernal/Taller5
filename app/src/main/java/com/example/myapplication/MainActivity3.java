package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    EditText editTextNumero1, editTextNumero2;
    TextView textViewresultpotencia;
    Button buttontotal,buttoninicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editTextNumero1 = (EditText) findViewById(R.id.editTextNumero1);
        editTextNumero2 = (EditText) findViewById(R.id.editTextNumero2);
        textViewresultpotencia = (TextView) findViewById(R.id.textViewresultpotencia);
        buttontotal = (Button) findViewById(R.id.buttontotal);
        buttontotal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int x, n, resul;
        n = Integer.parseInt(editTextNumero1.getText().toString());
        x = Integer.parseInt( editTextNumero2.getText().toString());
        resul = n;
        for (int i = 1; i < x; i++){
            resul = n * resul;

            textViewresultpotencia.setText(String.valueOf(resul));

        }

    }

    public void  buttoninicio (View view){

        Intent miIntent = new Intent(this,MainActivity.class);
        startActivity(miIntent);

    }
}