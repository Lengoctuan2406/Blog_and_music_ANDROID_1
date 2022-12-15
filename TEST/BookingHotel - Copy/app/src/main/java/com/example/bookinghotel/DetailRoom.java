package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class DetailRoom extends AppCompatActivity {
    ViewFlipper viewFlipper;
    TextView textView30;
    ImageView imageView14, imageView20;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_room);
        textView30 = findViewById(R.id.textView30);
        textView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailRoom.this, Policies.class);
                startActivity(i);
            }
        });
        imageView20 = findViewById(R.id.imageView20);
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailRoom.this, Review.class);
                startActivity(i);
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailRoom.this, RoomHistory.class);
                startActivity(i);
            }
        });

        imageView14 = findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailRoom.this, SeePictures.class);
                startActivity(i);
            }
        });

        Anhxa();
        ActionViewFlipper();
    }

    private void ActionViewFlipper() {
        List<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("https://i.pinimg.com/originals/b1/62/8e/b1628edd3f876fbfa5aa808b6676e381.jpg");
        mangquangcao.add("https://i.pinimg.com/originals/a2/29/55/a2295520e545c581f122c9bd5b0a77db.jpg");
        mangquangcao.add("https://i.pinimg.com/originals/b1/62/8e/b1628edd3f876fbfa5aa808b6676e381.jpg");
        for (int i = 0; i < mangquangcao.size(); i++) {
            ImageView imageView = new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
//        set animation
        Animation slide_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation slide_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipper.setInAnimation(slide_in);
        viewFlipper.setOutAnimation(slide_out);
    }
    private void Anhxa() {
        viewFlipper= findViewById(R.id.viewflipper);

    }
}