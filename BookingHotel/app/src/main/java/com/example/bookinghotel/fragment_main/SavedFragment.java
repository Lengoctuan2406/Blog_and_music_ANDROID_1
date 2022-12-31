package com.example.bookinghotel.fragment_main;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bookinghotel.R;
import com.example.bookinghotel.Searching;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SavedFragment extends Fragment {
    Button button;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = (Button) view.findViewById(R.id._195);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Searching.class);
                Calendar calendar = Calendar.getInstance();
                String Format = "dd/MM/yyyy";
                SimpleDateFormat date_from = new SimpleDateFormat(Format, Locale.TAIWAN);
                i.putExtra("date_from", date_from.format(calendar.getTime()));
                i.putExtra("date_to", date_from.format(calendar.getTime()));
                i.putExtra("country_name", "");
                i.putExtra("search", "");
                startActivity(i);
            }
        });

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saved, container, false);
    }
}