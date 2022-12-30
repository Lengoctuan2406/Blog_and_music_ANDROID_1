package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bookinghotel.adapter.AdapterReview;
import com.example.bookinghotel.database._5_table;

import java.util.ArrayList;
import java.util.List;

public class Review extends AppCompatActivity {
    RecyclerView recyclerView_review;
    ImageView _87;

    public void findViewById() {
        _87 = findViewById(R.id._87);
        recyclerView_review = findViewById(R.id.rvc_review);
    }

    public void setOnClickListener() {
        _87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Review.this, DetailRoom.class);
                startActivity(i);
            }
        });
    }

    public void others() {
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        recyclerView_review.setLayoutManager(gridLayoutManager);
        AdapterReview adapter_review = new AdapterReview(getListReview());
        recyclerView_review.setAdapter(adapter_review);
    }

    private List<_5_table> getListReview() {
        List<_5_table> reviews = new ArrayList<>();
        reviews.add(new _5_table("", "", "", "", "", "", "", "", "Khach san rat dep va dung nhu mo ta", R.drawable.image_customer_test_1, "Name customer"));
        reviews.add(new _5_table("", "", "", "", "", "", "", "", "Comment test", R.drawable.image_customer_test, "Name customer"));
        reviews.add(new _5_table("", "", "", "", "", "", "", "", "Khach san rat dep va dung nhu mo ta", R.drawable.image_customer_test_2, "Name customer"));
        reviews.add(new _5_table("", "", "", "", "", "", "", "", "Khach san rat dep va dung nhu mo ta", R.drawable.image_customer_test_1, "Name customer"));
        reviews.add(new _5_table("", "", "", "", "", "", "", "", "Khach san rat dep va dung nhu mo ta", R.drawable.image_customer_test_2, "Name customer"));
        return reviews;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        findViewById();
        setOnClickListener();
        others();
    }
}