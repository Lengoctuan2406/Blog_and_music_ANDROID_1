package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bookinghotel.adapter.AdapterReview;
import com.example.bookinghotel.adapter.AdapterSearching;
import com.example.bookinghotel.database.room_history;

import java.util.ArrayList;
import java.util.List;

public class Searching extends AppCompatActivity {
    RecyclerView _110;
    ImageView _107;

    public void findViewById() {
        _110 = findViewById(R.id._110);
        _107 = findViewById(R.id._107);
    }

    public void setOnClickListener() {
        _107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Searching.this, MainActivity.class);
                i.putExtra("fragment", 1);
                startActivity(i);
            }
        });
    }

    public void others() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        _110.setLayoutManager(gridLayoutManager);

        AdapterSearching adapter_list_search = new AdapterSearching(getListSearch());
        _110.setAdapter(adapter_list_search);
    }

    private List<room_history> getListSearch() {
        List<room_history> search_models = new ArrayList<>();

        search_models.add(new room_history(R.drawable.hotelroom1, "GO2JOY - WHITE LION ROOM", 25, 1, "2N - 1D", "Single beds", "Da Nang"));
        search_models.add(new room_history(R.drawable.hotelroom2, "GO2JOY - MILAN 1 ROOM", 30, 1, "2N - 1D", "Single beds", "Hoi An"));
        search_models.add(new room_history(R.drawable.hotelroom3, "GO2JOY- TRẦN GIA ROOM TÂN PHÚ", 14, 1, "2N - 1D", "Single beds", "Da Nang"));
        search_models.add(new room_history(R.drawable.hotelroom1, "GO2JOY - WHITE LION ROOM", 25, 1, "2N - 1D", "Single beds", "Da Nang"));
        search_models.add(new room_history(R.drawable.hotelroom2, "GO2JOY - MILAN 1 ROOM", 30, 1, "2N - 1D", "Single beds", "Hoi An"));
        search_models.add(new room_history(R.drawable.hotelroom3, "GO2JOY- TRẦN GIA ROOM TÂN PHÚ", 14, 1, "2N - 1D", "Single beds", "Da Nang"));

        return search_models;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        findViewById();
        setOnClickListener();
        others();
    }
}