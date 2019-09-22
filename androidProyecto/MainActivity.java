package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import funciones.clsEstadistica;

public class MainActivity extends AppCompatActivity {
    TextView d1, d2, d3, d4, d5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d1 = (TextView) findViewById(R.id.promedio);
        d2 = (TextView) findViewById(R.id.mediana);
        d3 = (TextView) findViewById(R.id.moda);
        d4 = (TextView) findViewById(R.id.rango);
        d5 = (TextView) findViewById(R.id.desv);

        String apodo = getIntent().getStringExtra("datos");
        leer(apodo);

    }
    public void leer(String datos){
        String linea;
        String vector[];
        String numeros[];
        clsEstadistica calculadora;

        double media, mediana, moda, rango, desviacion2;
        try{

            linea = datos;
            vector = linea.split(",");
            numeros = new String[vector.length];
            for(int i = 0;i < vector.length;i++){
                numeros = linea.split(",");
            }
            calculadora = new clsEstadistica(numeros);
            media = calculadora.promedio();
            String prome;
            prome = new Double(media).toString();
            d1.setText(prome);
            mediana = calculadora.mediana();
            String med = new Double(mediana).toString();
            d2.setText(med);
            desviacion2 = calculadora.desviacion();
            String des = new Double(desviacion2).toString();
            d5.setText(des);
            moda = calculadora.moda();
            String mod = new Double(moda).toString();
            d3.setText(mod);
            rango = calculadora.rango();
            String ran = new Double(rango).toString();
            d4.setText(ran);


        }catch(Exception ex){
            //System.out.println("Error: " + ex.getMessage());

        }
    }
}
