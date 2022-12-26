package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {
    TextView _84;
    Button _83;

    public void findViewById() {
        _84 = findViewById(R.id._84);
        _83 = findViewById(R.id._83);
    }

    public void setOnClickListener() {
        _83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LogIn.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim._2_slide_center_to_left, R.anim._2_slide_right_to_center);
            }
        });
        _84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LogIn.this, SignUp.class);
                startActivity(i);
            }
        });
    }

    public void others() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        findViewById();
        setOnClickListener();
        others();
    }
}