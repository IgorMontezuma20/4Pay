package com.example.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PixTransf extends AppCompatActivity {

    Button btnPixProximo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pix_transf);

        btnPixProximo = findViewById(R.id.btnPixProximo);

        btnPixProximo.setOnClickListener(view -> {
            startActivity(new Intent(this, PixTransfDestino.class));
        });


    }
}