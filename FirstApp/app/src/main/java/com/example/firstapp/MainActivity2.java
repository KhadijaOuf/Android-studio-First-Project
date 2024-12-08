package com.example.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    Button website,call, calculator;
    Intent intent_website,intent_call,intent_calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        website = findViewById(R.id.website);
        call = findViewById(R.id.call);
        calculator = findViewById(R.id.calculator);

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_website = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ensaf.ac.ma/")); // Uri.parse(): Utilisée pour convertir une chaîne de caractères en un objet Uri.
                startActivity(intent_website);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("0670588049"));
                startActivity(intent_call);
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_calculator = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent_calculator);
            }

        });
    }
}