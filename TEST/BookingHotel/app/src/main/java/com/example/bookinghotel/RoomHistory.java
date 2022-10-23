package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.bookinghotel.adapter.MyRoomHistoryAdapter;
import com.google.android.material.tabs.TabLayout;

public class RoomHistory extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    MyRoomHistoryAdapter myRoomHistoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_history);

        tabLayout = findViewById(R.id.tablayout_roomHistory);
        viewPager2 = findViewById(R.id.viewPager_roomHistory);
        myRoomHistoryAdapter = new MyRoomHistoryAdapter(this);
        viewPager2.setAdapter(myRoomHistoryAdapter);
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








    }
}