package com.example.ativiarnoti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProntopraJogar extends AppCompatActivity {
         private View btn_seguinte06;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prontopra_jogar);

        btn_seguinte06 = findViewById(R.id.btn_seguinte06);

        btn_seguinte06.setOnClickListener(View ->{
            Intent intent = new Intent(ProntopraJogar.this, TeladoAplicativo.class);
            startActivity(intent);
        });
    }
}