package com.example.buttondisable;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button buttonDisable;
    private Button buttonEnable;
    private TextView count;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable = findViewById(R.id.przycisk2);
        count = findViewById(R.id.text);


        buttonDisable.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                buttonDisable.setEnabled(false);
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH_SHORT).show();
                i=i+1;
                count.setText(String.valueOf(i));
            }
        });
        buttonEnable.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                buttonDisable.setEnabled(true);
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH_SHORT).show();
            }
        });
    }
}