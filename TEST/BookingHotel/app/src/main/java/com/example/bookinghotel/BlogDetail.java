package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bookinghotel.adapter.blog;

public class BlogDetail extends AppCompatActivity {
//
//    TextView body_des_blog;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_blog_detail);
//
//        body_des_blog = findViewById(R.id.body_des_blog);
//        body_des_blog.setText("This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An" +
//                "This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\n" +
//                "This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\\n\" +\n" +
//                "                \"This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\\n\" +\n" +
//                "                \"This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\\n\" +\n" +
//                "                \"This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...\\n\" +\n" +
//                "                \"This is a very famous drink shop in Hoi An. Tourists usually visit at least once when coming to Hoi An...");
TextView body_des_blog,nameBlog, addressBlog;
    ImageView imgBlog, icon_arrowback_blogFragment;
    blog blog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_detail);

        icon_arrowback_blogFragment = findViewById(R.id.icon_arrowback_blogFragment);
        icon_arrowback_blogFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BlogDetail.this, MainActivity.class);
                i.putExtra("fragment", 3);
                startActivity(i);
            }
        });


        body_des_blog = findViewById(R.id.body_des_blog);
        nameBlog = findViewById(R.id.name_des_blog);
        addressBlog = findViewById(R.id.address_des_blog);
        imgBlog = findViewById(R.id.img_des_blog);

        nameBlog.setText(getIntent().getExtras().getString("name"));
        addressBlog.setText(getIntent().getExtras().getString("address"));
        body_des_blog.setText(getIntent().getExtras().getString("des"));
        int imgDes = getIntent().getIntExtra("img", 0);
        imgBlog.setImageResource(imgDes);
    }

}