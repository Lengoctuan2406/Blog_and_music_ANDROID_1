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
import android.widget.TextView;

import com.example.bookinghotel.LogIn;
import com.example.bookinghotel.R;
import com.example.bookinghotel.RoomHistory;
import com.example.bookinghotel.Searching;
import com.example.bookinghotel.YourAccount;

public class AccountFragment extends Fragment {

    TextView txt_changeYourinfor, txt_yourHistory, txt_logOut;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txt_changeYourinfor = (TextView) view.findViewById(R.id.txt_changeYourinfor);
        txt_changeYourinfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), YourAccount.class);
                startActivity(i);
            }
        });

        txt_yourHistory = (TextView) view.findViewById(R.id.txt_yourHistory);
        txt_yourHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), RoomHistory.class);
                startActivity(i);
            }
        });

        txt_logOut = (TextView) view.findViewById(R.id.txt_logOut);
        txt_logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), LogIn.class);
                startActivity(i);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false);
    }
}