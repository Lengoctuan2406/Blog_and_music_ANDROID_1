package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bookinghotel.adapter.AdapterSearching;

public class SeePictures extends AppCompatActivity {
    ImageView _87;

    public void findViewById() {
        _87 = findViewById(R.id._87);
    }

    public void setOnClickListener() {
        _87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SeePictures.this, DetailRoom.class);
                startActivity(i);
            }
        });
    }

    public void others() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_pictures);
        findViewById();
        setOnClickListener();
        others();
    }
}