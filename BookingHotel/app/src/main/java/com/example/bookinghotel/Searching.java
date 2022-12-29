package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bookinghotel.adapter.AdapterSearching;
import com.example.bookinghotel.database._1_table;

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
                overridePendingTransition(R.anim._1_slide_center_to_right, R.anim._1_slide_left_to_center);
            }
        });
    }

    public void others() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        _110.setLayoutManager(gridLayoutManager);

        AdapterSearching adapter_list_search = new AdapterSearching(getListSearch());
        _110.setAdapter(adapter_list_search);
    }

    private List<_1_table> getListSearch() {
        List<_1_table> search_models = new ArrayList<>();

        search_models.add(new _1_table(R.drawable.hotelroom1, "GO2JOY - WHITE LION ROOM", 25, 1, "2N - 1D", "Da Nang", "hotel"));
        search_models.add(new _1_table(R.drawable.hotelroom2, "GO2JOY - MILAN 1 ROOM", 30, 1, "2N - 1D", "Hoi An", "hotel"));
        search_models.add(new _1_table(R.drawable.hotelroom3, "GO2JOY- TRẦN GIA ROOM TÂN PHÚ", 14, 1, "2N - 1D", "Da Nang", "hotel"));
        search_models.add(new _1_table(R.drawable.hotelroom1, "GO2JOY - WHITE LION ROOM", 25, 1, "2N - 1D", "Da Nang", "hotel"));
        search_models.add(new _1_table(R.drawable.hotelroom2, "GO2JOY - MILAN 1 ROOM", 30, 1, "2N - 1D", "Hoi An", "hotel"));
        search_models.add(new _1_table(R.drawable.hotelroom3, "GO2JOY- TRẦN GIA ROOM TÂN PHÚ", 14, 1, "2N - 1D", "Da Nang", "hotel"));

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