package com.example.ativiarnoti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
        private View btn_seguinte05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_seguinte05 = findViewById(R.id.btn_seguinte05);

        btn_seguinte05.setOnClickListener(View ->{
                    Intent intent = new Intent(MainActivity.this, ProntopraJogar.class);
                    startActivity(intent);
        });
    }
}