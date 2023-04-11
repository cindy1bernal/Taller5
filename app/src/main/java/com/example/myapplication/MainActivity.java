package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btn_ubicacion;
    private  Button miBoton;

    private EditText etValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miBoton = findViewById(R.id.miBoton);
       // miBoton.setOnClickListener(new View.OnClickListener());
        etValor= findViewById(R.id.etValor);
      /*  {

            @Override
            public void onClick(View view) {cambiarPantalla();}
        });*/
        btn_ubicacion= (ImageButton) findViewById(R.id.btn_ubicacion);
        btn_ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_ubicacion = new Intent(MainActivity.this,MainActivity5.class);
                startActivity( btn_ubicacion);
            }
        });
    }
    public void cambiarPantalla(){
        Intent miIntent1 = new Intent(this,MainActivity.class);
        startActivity(miIntent1);
    }

    public void funcionBoton(View view){

        Intent miIntent1 = new Intent(this,MainActivity2.class);
        Intent miIntent2 = new Intent(this,MainActivity3.class);
        Intent miIntent3 = new Intent(this,MainActivity4.class);

        if (Integer.parseInt(etValor.getText().toString()) ==1){
            startActivity(miIntent1);
        } else if (Integer.parseInt(etValor.getText().toString()) == 2) {
            startActivity(miIntent2);
        } else if (Integer.parseInt(etValor.getText().toString()) == 3){
            startActivity(miIntent3);
        }
    }
}
