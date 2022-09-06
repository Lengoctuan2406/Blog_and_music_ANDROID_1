package com.example.podcast_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.podcast_app.fragment_home.AccountFragment;
import com.example.podcast_app.fragment_home.BlogFragment;
import com.example.podcast_app.fragment_home.BookmarkFragment;
import com.example.podcast_app.fragment_home.HomeFragment;
import com.example.podcast_app.fragment_home.PodcastFragment;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    BlogFragment blogFragment = new BlogFragment();
    PodcastFragment podcastFragment = new PodcastFragment();
    HomeFragment homeFragment = new HomeFragment();
    BookmarkFragment bookmarkFragment = new BookmarkFragment();
    AccountFragment accountFragment = new AccountFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ẩn tabba
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, blogFragment).commit();

//        hiện số thông báo mới
        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.bookmark);
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(8);



        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.blog:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, blogFragment).commit();
                        return true;
                    case R.id.podcast:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, podcastFragment).commit();
                        return true;
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return true;
                    case R.id.bookmark:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, bookmarkFragment).commit();
                        return true;
                    case R.id.account:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, accountFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }

}