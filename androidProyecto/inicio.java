package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class inicio extends AppCompatActivity {
EditText ap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        ap = findViewById(R.id.txtDatos);
    }
    public void click(View v){
        Intent i = new Intent(inicio.this, MainActivity.class);
        i.putExtra("datos", ap.getText()+":");
        startActivity(i);

    }
}
