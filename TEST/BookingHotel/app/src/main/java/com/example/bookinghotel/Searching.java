package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bookinghotel.adapter.AdapterBlog;
import com.example.bookinghotel.adapter.AdapterSearching;
import com.example.bookinghotel.adapter.blog;
import com.example.bookinghotel.adapter.room_history;

import java.util.ArrayList;
import java.util.List;

public class Searching extends AppCompatActivity {

    RecyclerView recyclerView_resultSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        recyclerView_resultSearch = findViewById(R.id.rvc_list_resultSearch);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        recyclerView_resultSearch.setLayoutManager(gridLayoutManager);

        AdapterSearching adapter_list_search = new AdapterSearching(getListSearch());
        recyclerView_resultSearch.setAdapter(adapter_list_search);
    }
    private List<room_history> getListSearch() {
        List<room_history> search_models = new ArrayList<>();

        search_models.add(new room_history(R.drawable.image_customer_test,"Name hotel saved", 25, 1, "2N - 1D", "Single beds", "Da Nang"));
        search_models.add(new room_history(R.drawable.image_customer_test,"Name hotel ne", 30, 1, "2N - 1D", "Single beds", "Hoi An"));
        search_models.add(new room_history(R.drawable.image_customer_test,"Name hotel", 14, 1, "2N - 1D", "Single beds", "Da Nang"));
        search_models.add(new room_history(R.drawable.image_customer_test,"Name hotel", 15, 1, "2N - 1D", "Single beds", "Da Nang"));


        return search_models;
    }
}