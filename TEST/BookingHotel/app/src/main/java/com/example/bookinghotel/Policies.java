package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Policies extends AppCompatActivity {

    ImageView ImageIconBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policies);
        ImageIconBack = findViewById(R.id.ImageIconBack);
        ImageIconBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Policies.this, DetailRoom.class);
                startActivity(i);
            }
        });
    }
}