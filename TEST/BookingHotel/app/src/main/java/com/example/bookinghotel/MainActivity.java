package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView  bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    BlogFragment blogFragment = new BlogFragment();
    AccountFragment accountFragment = new AccountFragment();
    SavedFragment savedFragment = new SavedFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottom_nav);

        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_icon_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, homeFragment).commit();
                        return true;
                    case R.id.menu_icon_saved:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, savedFragment).commit();
                        return true;
                    case R.id.menu_icon_blog:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, blogFragment).commit();
                        return true;
                    case R.id.menu_icon_account:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, accountFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}