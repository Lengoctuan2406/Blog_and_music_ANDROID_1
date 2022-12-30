package com.example.bookinghotel.database;

import java.util.Date;

public class _6_table {
    public String user_id; //1
    public String name_client; //2
    public String email_client; //3
    public String password_client; //4
    public Date date_of_birth_client; //5
    public String gender_client; //6
    public String phone_client; //7
    public int avatar_client; //8
    public String facebook_client; //9
    public String instagram_client; //10
    public String role_client; //11
    public String hotel_id; //12
    public String name_hotel; //13
    public String country_id; //15
    public String hotel_details_id; //17
    public String like_id; //19
    public int price_hotel_detail; //23
    public String comments_id; //28
    public String order_id; //30
    public String blog_id; //34
    public int picture_hotel; //39

    public _6_table() {};
    public _6_table(String _user_id, String _hotel_id, String _country_id,
                    String _hotel_details_id, String _like_id, String _comments_id,
                    String _order_id, String _blog_id,
                    String _name_client, String _email_client, String _password_client,
                    Date _date_of_birth_client, String _gender_client,
                    String _phone_client, int _avatar_client, String _facebook_client,
                    String _instagram_client, String _role_client) {
        user_id = _user_id;
        hotel_id = _hotel_id;
        country_id = _country_id;
        hotel_details_id = _hotel_details_id;
        like_id = _like_id;
        comments_id = _comments_id;
        order_id = _order_id;
        blog_id = _blog_id;
        name_client = _name_client;
        email_client = _email_client;
        password_client = _password_client;
        date_of_birth_client = _date_of_birth_client;
        gender_client = _gender_client;
        phone_client = _phone_client;
        avatar_client = _avatar_client;
        facebook_client = _facebook_client;
        instagram_client = _instagram_client;
        role_client = _role_client;
    }
}
