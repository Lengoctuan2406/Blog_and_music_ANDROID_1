package com.example.podcast_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.podcast_app.fragment_home.HomeFragment;
import com.example.podcast_app.tablayout_home.new_home;

public class Menuhome_page extends AppCompatActivity {

    ImageView btn_arrowback, btn_home, btn_like, btn_bookmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_menuhome_page);


        btn_arrowback = findViewById(R.id.btn_arrowback_menu);
        btn_home = findViewById(R.id.btn_home_menu);
        btn_like = findViewById(R.id.btn_like_menu_home);
        btn_bookmark = findViewById(R.id.bookmark_menu_home);

//        from activity to frame
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment fm = new new_home();
//                Fragment fm1 = new HomeFragment();
//                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.menuhome, fm1).commit();
//                getSupportFragmentManager().beginTransaction().replace(R.id.menuhome1, new HomeFragment()).commit();
                Intent intent = new Intent(Menuhome_page.this, HomeFragment.class);
                startActivity(intent);
               }
        });

        btn_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_like.setImageResource(R.drawable.ic_baseline_favorite_red);
            }
        });

        btn_bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_bookmark.setImageResource(R.drawable.ic_baseline_bookmark_added_24);
            }
        });
    }


    //@Override
//    public void finish() {
//        super.finish();
//        overridePendingTransition(R.anim.menuhome_right_in,
//                R.anim.menuhome_left_out);
//    }

}