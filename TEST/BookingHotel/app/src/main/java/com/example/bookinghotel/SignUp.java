package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    TextView textViewSignUp4;
    Button buttonSignUp4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        textViewSignUp4 = findViewById(R.id.textViewSignUp4);
        buttonSignUp4 = findViewById(R.id.buttonSignUp4);
        textViewSignUp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUp.this, LogIn.class);
                startActivity(i);
            }
        });
        buttonSignUp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUp.this, LogIn.class);
                startActivity(i);
            }
        });
    }
}