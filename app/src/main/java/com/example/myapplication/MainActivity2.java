package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    EditText editTextNum1, editTextNum2;
    TextView  textViewresultmultiplica;
    Button buttontotal,buttoninicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextNum1 = (EditText) findViewById(R.id.Exponente);
        editTextNum2 = (EditText) findViewById(R.id.Base);
        textViewresultmultiplica = (TextView) findViewById(R.id.Resultado);
        buttontotal = (Button) findViewById(R.id.buttontotal);
        buttontotal.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        int n1, n2, res;
        n1 = Integer.parseInt(editTextNum1.getText().toString());
        n2 = Integer.parseInt(editTextNum2.getText().toString());
        res = n1 * n2;
        textViewresultmultiplica.setText("la multiplicacion es " + res);
        Toast.makeText(getApplicationContext(), " " + res, Toast.LENGTH_LONG).show();

    }

    public void  buttoninicio (View view){

        Intent miIntent = new Intent(this,MainActivity.class);
        startActivity(miIntent);

    }


}
