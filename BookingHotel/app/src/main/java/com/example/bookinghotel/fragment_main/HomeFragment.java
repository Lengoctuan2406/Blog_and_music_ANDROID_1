package com.example.bookinghotel.fragment_main;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.bookinghotel.R;
import com.example.bookinghotel.Searching;
import com.example.bookinghotel.adapter.AdapterHotel;
import com.example.bookinghotel.adapter.AdapterSearching;
import com.example.bookinghotel.database._1_table;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView _200;
    Button _195;
    EditText editTextTextPersonName4;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //findViewById
        _195 = (Button) view.findViewById(R.id._195);
        _200 = (RecyclerView) view.findViewById(R.id.rcv_tophotel);
        editTextTextPersonName4 = (EditText) view.findViewById(R.id.editTextTextPersonName4);
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
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        _200.setLayoutManager(linearLayoutManager);

        AdapterHotel adapterHotel = new AdapterHotel(getListSearch());
        _200.setAdapter(adapterHotel);

        MaterialDatePicker datePicker = MaterialDatePicker.Builder.dateRangePicker()
                .setSelection(Pair.create(MaterialDatePicker.thisMonthInUtcMilliseconds(),
                        MaterialDatePicker.todayInUtcMilliseconds())).build();

        editTextTextPersonName4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePicker.show(getActivity().getSupportFragmentManager(), "Choose Date");
                datePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {
                        editTextTextPersonName4.setText(datePicker.getHeaderText());
                    }
                });
            }
        });
        //------
    }

    private List<_1_table> getListSearch() {
        List<_1_table> search_models = new ArrayList<>();

        search_models.add(new _1_table("", "", "", "", "", "", "", "", R.drawable.hotelroom1, "GO2JOY - WHITE LION ROOM", 25, 1, "2N - 1D", "Da Nang", "hotel"));
        search_models.add(new _1_table("", "", "", "", "", "", "", "", R.drawable.hotelroom2, "GO2JOY - MILAN 1 ROOM", 30, 1, "2N - 1D", "Hoi An", "hotel"));
        search_models.add(new _1_table("", "", "", "", "", "", "", "", R.drawable.hotelroom3, "GO2JOY- TRẦN GIA ROOM TÂN PHÚ", 14, 1, "2N - 1D", "Da Nang", "hotel"));
        search_models.add(new _1_table("", "", "", "", "", "", "", "", R.drawable.hotelroom1, "GO2JOY - WHITE LION ROOM", 25, 1, "2N - 1D", "Da Nang", "hotel"));
        search_models.add(new _1_table("", "", "", "", "", "", "", "", R.drawable.hotelroom2, "GO2JOY - MILAN 1 ROOM", 30, 1, "2N - 1D", "Hoi An", "hotel"));
        search_models.add(new _1_table("", "", "", "", "", "", "", "", R.drawable.hotelroom3, "GO2JOY- TRẦN GIA ROOM TÂN PHÚ", 14, 1, "2N - 1D", "Da Nang", "hotel"));

        return search_models;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}