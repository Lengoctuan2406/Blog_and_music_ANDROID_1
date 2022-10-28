package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BlogDetail extends AppCompatActivity {

    TextView body_des_blog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_detail);

        body_des_blog = findViewById(R.id.body_des_blog);
        body_des_blog.setText("This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An" +
                "This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\n" +
                "This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\\n\" +\n" +
                "                \"This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\\n\" +\n" +
                "                \"This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\\n\" +\n" +
                "                \"This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\\n\" +\n" +
                "                \"This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...");
    }
}