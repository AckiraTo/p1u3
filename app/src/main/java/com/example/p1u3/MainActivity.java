package com.example.p1u3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alta;
        Button baja;
        Button modificacion;
        Button eliminacion;

        alta = (Button) findViewById(R.id.alta);
        alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "alta", Toast.LENGTH_SHORT).show();
            }
        });

        baja = (Button) findViewById(R.id.baja);
        baja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "baja", Toast.LENGTH_SHORT).show();
            }
        });

        modificacion = (Button) findViewById(R.id.modificacion);
        modificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "se ha modificado ", Toast.LENGTH_SHORT).show();
            }
        });

        eliminacion = (Button) findViewById(R.id.eliminacion);
        eliminacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "se ha eliminado", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
