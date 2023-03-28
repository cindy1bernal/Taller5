package com.example.myapplication;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

    EditText editTextNum;
    TextView textViewresult;
    Button buttontotal, buttoninicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        editTextNum = (EditText) findViewById(R.id.Exponente);
        textViewresult = (TextView) findViewById(R.id.Resultado);
        buttontotal = (Button) findViewById(R.id.buttontotal);
        buttontotal.setOnClickListener(this);
        buttoninicio = (Button) findViewById(R.id.buttoninicio);
        buttoninicio.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       int n1,resul ,log;
        n1 = Integer.parseInt(editTextNum.getText().toString());

        int N = n1;

        TextView fibText = findViewById(R.id.Resultado);

        String result = nFib(N);


        fibText.setText(result);
    }
    static String nFib(int N)
    {
        if (N > 0) {
            long resul[] = new long[N];

            resul[0] = resul[1] = 1;

            for (int i = 2; i <= N - 1; i++) {
                resul[i] = resul[i - 1] + resul[i - 2];
            }

            for (long res : resul) {

                Log.d(TAG, String.valueOf(res));

            }
            Log.d(TAG, "The 15th Fibonacci number is " + resul[N-1]);

            return Arrays.toString(resul);
        }
        return "Not a valid value of N";
    }

    public void  buttoninicio (View view){

        Intent miIntent = new Intent(this,MainActivity.class);
        startActivity(miIntent);

    }
}


