package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    TextView textView31;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        textView31 = findViewById(R.id.textView31);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LogIn.this, MainActivity.class);
                startActivity(i);
            }
        });
        textView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LogIn.this, SignUp.class);
                startActivity(i);
            }
        });
    }
}