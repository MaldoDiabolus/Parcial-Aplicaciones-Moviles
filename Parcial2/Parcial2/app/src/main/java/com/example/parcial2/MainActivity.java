package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Siguiente;


    private EditText EditText5;
    private EditText EditText6;
    private EditText EditText7;
    private EditText EditText8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Siguiente=(Button) findViewById(R.id.Regresar);

        EditText5=(EditText) findViewById(R.id.editTextText5);
        EditText6=(EditText) findViewById(R.id.editTextText6);
        EditText7=(EditText) findViewById(R.id.editTextText7);
        EditText8=(EditText) findViewById(R.id.editTextText8);

        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Factura2.class);
            }
        });

    }

}