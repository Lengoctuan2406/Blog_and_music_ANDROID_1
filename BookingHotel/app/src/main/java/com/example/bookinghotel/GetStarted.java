package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bookinghotel.database.DatabaseHandler;
import com.example.bookinghotel.database._0_blogs;
import com.example.bookinghotel.database._0_comments;
import com.example.bookinghotel.database._0_countries;
import com.example.bookinghotel.database._0_hotel_details;
import com.example.bookinghotel.database._0_hotels;
import com.example.bookinghotel.database._0_likes;
import com.example.bookinghotel.database._0_orders;
import com.example.bookinghotel.database._0_users;

import java.sql.Date;

public class GetStarted extends AppCompatActivity {
    Button _76, _77;
    DatabaseHandler db = new DatabaseHandler(this);

    public void findViewById() {
        _76 = findViewById(R.id._76);
        _77 = findViewById(R.id._77);
    }

    public void setOnClickListener() {
        _76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GetStarted.this, LogIn.class);
                startActivity(i);
            }
        });
        _77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GetStarted.this, SignUp.class);
                startActivity(i);
            }
        });
    }

    public void others() {
//        db.execSQL("CREATE TABLE users(user_id TEXT PRIMARY KEY,name_client TEXT,email_client TEXT,password_client TEXT,date_of_birth_client TEXT, gender_client TEXT, phone_client TEXT, avatar_client INTEGER, facebook_client TEXT, instagram_client TEXT, role_client TEXT);");
//        db.execSQL("CREATE TABLE hotels(hotel_id TEXT PRIMARY KEY,name_hotel TEXT, description_hotel TEXT, picture_hotel INTEGER, country_id TEXT, address_hotel TEXT, star_hotel INTEGER, like_id TEXT);");
//        db.execSQL("CREATE TABLE likes(like_id TEXT PRIMARY KEY,user_id TEXT);");
//        db.execSQL("CREATE TABLE hotel_details(hotel_details_id TEXT PRIMARY KEY,hotel_id TEXT,number_of_room_hotel_detail TEXT, size_hotel_detail TEXT, description_hotel_detail TEXT, price_hotel_detail INTEGER, status_hotel_detail INTEGER, picture_1_hotel_detail INTEGER, picture_2_hotel_detail INTEGER, picture_3_hotel_detail INTEGER);");
//        db.execSQL("CREATE TABLE comments(comments_id TEXT PRIMARY KEY,hotel_id TEXT,user_id TEXT, content_comments TEXT);");
//        db.execSQL("CREATE TABLE orders(order_id TEXT PRIMARY KEY,user_id TEXT, hotel_id TEXT, hotel_details_id TEXT, date_start_order TEXT, date_end_order TEXT, status_order INTEGER);");
//        db.execSQL("CREATE TABLE blogs(blog_id TEXT PRIMARY KEY,title_blog TEXT, content_blog TEXT, picture_blog INTEGER, country_id TEXT);");
//        db.execSQL("CREATE TABLE countries(country_id TEXT PRIMARY KEY,country_name TEXT);");
        db.addUsers(new _0_users("1", "", "", "", ""
                , "", "", "", "Le Ngoc Tuan"
                , "1", "1", "2001-06-24"
                , "Nam", "0983212323", R.drawable.image_customer_test
                , "", "", ""));
        db.addUsers(new _0_users("2", "", "", "", ""
                , "", "", "", "Le Ngoc Tuan"
                , "2", "2", "2001-06-24"
                , "Nam", "0983212323", R.drawable.image_customer_test
                , "", "", ""));
        db.addHotel(new _0_hotels("", "1", "", "", ""
                , "", "", "", "Hotel"
                , "mô tả của hotel", R.drawable.hotelroom1
                , "Đà nẵng", 1));
        db.addLikes(new _0_likes("1", "", "", "", "1"
                , "", "", ""));
        db.addHotelDetail(new _0_hotel_details("", "1", "", "1", ""
                , "", "", "", "Single room", "215ft",
                "Mô tả chi tiết của hotel", 20, 1, R.drawable.hotelroom1
        , R.drawable.hotelroom2, R.drawable.hotelroom3));
        db.addHotelDetail(new _0_hotel_details("", "1", "", "2", ""
                , "", "", "", "Double room", "215ft",
                "Mô tả chi tiết của hotel", 20, 1, R.drawable.hotelroom1
                , R.drawable.hotelroom2, R.drawable.hotelroom3));
        db.addComments(new _0_comments("1", "1", "", "2", ""
                , "1", "", "", "cũng được đấy"));

        db.addOrders(new _0_orders("1", "1", "", "1", ""
                , "", "1", "", "2001-02-01", "2001-02-01", 0));

        db.addBlogs(new _0_blogs("", "", "1", "", ""
                , "", "", "1", "title của blog", "toàn bộ nội dung\nxuoongs hàng", R.drawable.blog1));
        db.addBlogs(new _0_blogs("", "", "1", "", ""
                , "", "", "2", "title của blog 2", "toàn bộ nội dung\nxuoongs hàng", R.drawable.blog2));

        db.addCountries(new _0_countries("", "", "", "", ""
                , "", "", "", "Đà Nẵng"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        findViewById();
        others();
        setOnClickListener();
    }
}