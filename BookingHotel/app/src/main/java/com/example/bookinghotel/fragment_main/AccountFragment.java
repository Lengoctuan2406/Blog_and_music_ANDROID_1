package com.example.bookinghotel.fragment_main;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bookinghotel.LogIn;
import com.example.bookinghotel.R;
import com.example.bookinghotel.RoomHistory;
import com.example.bookinghotel.YourAccount;

public class AccountFragment extends Fragment {
    TextView _185, _187, _190;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //findViewById
        _185 = (TextView) view.findViewById(R.id._185);
        _187 = (TextView) view.findViewById(R.id._187);
        _190 = (TextView) view.findViewById(R.id._190);
        //------------
        
        //setOnClickListener
        _185.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), YourAccount.class);
                startActivity(i);
            }
        });
        _187.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), RoomHistory.class);
                startActivity(i);
            }
        });
        _190.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), LogIn.class);
                startActivity(i);
            }
        });
        //------------------
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_account, container, false);
    }
}