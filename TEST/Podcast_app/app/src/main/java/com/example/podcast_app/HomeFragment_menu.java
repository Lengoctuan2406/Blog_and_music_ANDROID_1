package com.example.podcast_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.podcast_app.fragment_home.HomeFragment;


public class HomeFragment_menu extends Fragment {

    ImageView btn_arrowback, btn_home;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_menu, container, false);
//        btn_home = view.findViewById(R.id.btn_home_menu);
//
//        btn_home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
//                fm.replace(R.id.menuhome, new HomeFragment()).commit();
//            }
//        });
//
//        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_home = view.findViewById(R.id.btn_home_menu);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), HomeFragment.class );
//                startActivity(intent);
                //getActivity().overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.menuhome, new HomeFragment()).commit();

            }
        });
    }
}