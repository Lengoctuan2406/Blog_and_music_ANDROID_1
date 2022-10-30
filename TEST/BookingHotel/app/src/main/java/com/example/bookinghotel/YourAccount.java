package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class YourAccount extends AppCompatActivity {
    ImageView icon_arrowback_accountFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_account);
        icon_arrowback_accountFragment = findViewById(R.id.icon_arrowback_accountFragment);
        icon_arrowback_accountFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(YourAccount.this, MainActivity.class);
                i.putExtra("fragment", 4);
                startActivity(i);
            }
        });
    }
}