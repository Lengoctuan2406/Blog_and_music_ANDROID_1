package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bookinghotel.database.blog;

public class BlogDetail extends AppCompatActivity {
    TextView _13, _9, _11;
    ImageView _7, _1;
    Button _14;

    public void findViewById() {
        _14 = findViewById(R.id._14);
        _1 = findViewById(R.id._1);
        _13 = findViewById(R.id._13);
        _9 = findViewById(R.id._9);
        _11 = findViewById(R.id._11);
        _7 = findViewById(R.id._7);
    }

    public void setOnClickListener() {
        _14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BlogDetail.this, Searching.class);
                startActivity(i);
            }
        });
        _1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BlogDetail.this, MainActivity.class);
                i.putExtra("fragment", 3);
                startActivity(i);
            }
        });
    }

    public void others() {
        _9.setText(getIntent().getExtras().getString("name"));
        _11.setText(getIntent().getExtras().getString("address"));
        _13.setText(getIntent().getExtras().getString("des"));
        int imgDes = getIntent().getIntExtra("img", 0);
        _7.setImageResource(imgDes);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_detail);
        findViewById();
        setOnClickListener();
        others();
    }
}