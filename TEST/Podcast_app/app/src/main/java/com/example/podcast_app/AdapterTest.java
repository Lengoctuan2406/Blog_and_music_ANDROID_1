package com.example.podcast_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.podcast_app.fragment_home.HomeFragment;
import com.example.podcast_app.tablayout_home.creative_home;
import com.example.podcast_app.tablayout_home.new_home;
import com.example.podcast_app.tablayout_home.popular_home;

public class AdapterTest extends FragmentStateAdapter {

    public AdapterTest(@NonNull HomeFragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new new_home();
            case 1:
                return new popular_home();
            case 2:
                return new creative_home();
            default:
                return new new_home();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
