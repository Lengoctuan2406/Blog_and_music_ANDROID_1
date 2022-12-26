package com.example.bookinghotel.fragment_main;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bookinghotel.R;
import com.example.bookinghotel.Searching;
import com.example.bookinghotel.adapter.AdapterSearching;
import com.example.bookinghotel.database.room_history;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView _200;
    Button _195;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //findViewById
        _195 = (Button) view.findViewById(R.id._195);
        _200 = (RecyclerView) view.findViewById(R.id._200);
        //------------

        //setOnClickListener
        _195.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Searching.class);
                startActivity(i);
            }
        });
        //------------------

        //others
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        _200.setLayoutManager(gridLayoutManager);

        AdapterSearching adapter_list_search = new AdapterSearching(getListSearch());
        _200.setAdapter(adapter_list_search);
        //------
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}