package com.example.podcast_app.fragment_home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
//import android.support.v4.view.ViewPager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.podcast_app.AdapterTest;
import com.example.podcast_app.HomeFragment_menu;
import com.example.podcast_app.MainActivity;
import com.example.podcast_app.Menuhome_page;
import com.example.podcast_app.R;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    AdapterTest adapterTest;
    ImageView btnSearch, btnMenu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout_home);
        viewPager2 = (ViewPager2) view.findViewById(R.id.view_paper_home);
        btnMenu = (ImageView) view.findViewById(R.id.btn_grid_home);
        btnSearch = (ImageView) view.findViewById(R.id.btn_search_home);

        adapterTest = new AdapterTest(this);
        viewPager2.setAdapter(adapterTest);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                tabLayout.getTabAt(position).select();
            }
        });

//        click menu fragment to activity
         btnMenu.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getActivity(), Menuhome_page.class );
                 startActivity(intent);
                 //getActivity().overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//                 FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
//                 fm.replace(R.id.home, new Menuhome_page()).commit();
             }
         });

    }
}