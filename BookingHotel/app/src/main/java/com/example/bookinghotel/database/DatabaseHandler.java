package com.example.bookinghotel.database;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.List;

//DatabaseHandler db = new DatabaseHandler(this);
//db.addContact(new Contact(Name, Phone));

public class DatabaseHandler extends SQLiteOpenHelper {

    public DatabaseHandler(Context context) {
        super(context, "booking_hotel", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE users(user_id TEXT PRIMARY KEY,name_client TEXT,email_client TEXT,password_client TEXT,date_of_birth_client TEXT, gender_client TEXT, phone_client TEXT, avatar_client INTEGER, facebook_client TEXT, instagram_client TEXT, role_client TEXT);");
        db.execSQL("CREATE TABLE hotels(hotel_id TEXT PRIMARY KEY,name_hotel TEXT, description_hotel TEXT, picture_hotel INTEGER, country_id TEXT, address_hotel TEXT, hotel_details_id TEXT, star_hotel INTEGER, like_id TEXT);");
        db.execSQL("CREATE TABLE likes(like_id TEXT PRIMARY KEY,user_id TEXT);");
        db.execSQL("CREATE TABLE hotel_details(hotel_details_id TEXT PRIMARY KEY,number_of_room_hotel_detail TEXT, size_hotel_detail TEXT, description_hotel_detail TEXT, price_hotel_detail INTEGER, status_hotel_detail TEXT, picture_1_hotel_detail INTEGER, picture_2_hotel_detail INTEGER, picture_3_hotel_detail INTEGER);");
        db.execSQL("CREATE TABLE comments(comments_id TEXT PRIMARY KEY,hotel_id TEXT,user_id TEXT, content_comments TEXT);");
        db.execSQL("CREATE TABLE orders(order_id TEXT PRIMARY KEY,user_id TEXT, hotel_id TEXT, hotel_details_id TEXT, date_start_order TEXT, date_end_order TEXT, status_order TEXT);");
        db.execSQL("CREATE TABLE blogs(blog_id TEXT PRIMARY KEY,title_blog TEXT, content_blog TEXT, picture_blog INTEGER, country_id TEXT);");
        db.execSQL("CREATE TABLE countries(country_id TEXT PRIMARY KEY,country_name TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");
        db.execSQL("DROP TABLE IF EXISTS hotels");
        db.execSQL("DROP TABLE IF EXISTS likes");
        db.execSQL("DROP TABLE IF EXISTS hotel_details");
        db.execSQL("DROP TABLE IF EXISTS comments");
        db.execSQL("DROP TABLE IF EXISTS orders");
        db.execSQL("DROP TABLE IF EXISTS blogs");
        db.execSQL("DROP TABLE IF EXISTS countries");
        onCreate(db);
    }

    public _6_table checkAccount(String _email_client, String _password_client) {
        _6_table account = new _6_table();
        String selectQuery = "SELECT user_id, name_client FROM users WHERE email_client='" + _email_client + "' AND password_client='" + _password_client + "';";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            account.user_id = cursor.getString(0);
            account.name_client = cursor.getString(1);
        } else {
            account.user_id = "";
            account.name_client = "";
        }
        return account;
    }

    public void addAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("user_id", "6");
        values.put("name_client", "Le Ngoc Toan");
        values.put("email_client", "1");
        values.put("password_client", "2");
        values.put("date_of_birth_client", "2001-08-24");
        values.put("gender_client", "Nam");
        values.put("phone_client", "0983212323");
        values.put("avatar_client", 1);
        values.put("facebook_client", "");
        values.put("instagram_client", "");
        values.put("role_client", "");
        db.insert("users", null, values);

        values.put("user_id", "9");
        values.put("name_client", "Le Ngoc Tuan");
        values.put("email_client", "1");
        values.put("password_client", "1");
        values.put("date_of_birth_client", "2001-06-24");
        values.put("gender_client", "Nam");
        values.put("phone_client", "0983212323");
        values.put("avatar_client", 1);
        values.put("facebook_client", "");
        values.put("instagram_client", "");
        values.put("role_client", "");
        db.insert("users", null, values);
        db.close();
    }

//    public void add_6_table(_6_table account) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put("user_id", account.user_id);
//        values.put("name_client", account.name_client);
//        values.put("email_client", account.email_client);
//        values.put("password_client", account.password_client);
//        values.put("date_of_birth_client", String.valueOf(account.date_of_birth_client));
//        values.put("gender_client", account.gender_client);
//        values.put("phone_client", account.phone_client);
//        values.put("avatar_client", account.avatar_client);
//        values.put("facebook_client", account.facebook_client);
//        values.put("instagram_client", account.instagram_client);
//        values.put("role_client", account.role_client);
//        db.insert("users", null, values);
//        db.close();
//    }
//
//    Contact getContact(int id) {
//        Contact contact = new Contact();
//        String selectQuery = "SELECT * FROM " + TABLE_CONTACTS + " WHERE " + KEY_ID + "=" + id;
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//        if (cursor.moveToFirst()) {
//            contact.setID(Integer.parseInt(cursor.getString(0)));
//            contact.setName(cursor.getString(1));
//            contact.setPhoneNumber(cursor.getString(2));
//        }
//        return contact;
//    }
//
//    public List<Contact> getAllContacts() {
//        List<Contact> contactList = new ArrayList<Contact>();
//        String selectQuery = "SELECT  * FROM " + TABLE_CONTACTS;
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//        if (cursor.moveToFirst()) {
//            do {
//                Contact contact = new Contact();
//                contact.setID(Integer.parseInt(cursor.getString(0)));
//                contact.setName(cursor.getString(1));
//                contact.setPhoneNumber(cursor.getString(2));
//                contactList.add(contact);
//            } while (cursor.moveToNext());
//        }
//        return contactList;
//    }
//
//    public int updateContact(Contact contact) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put(KEY_NAME, contact.getName());
//        values.put(KEY_PH_NO, contact.getPhoneNumber());
//        return db.update(TABLE_CONTACTS, values, KEY_ID + " = ?",
//                new String[]{String.valueOf(contact.getID())});
//    }
//
//    public void deleteContact(Contact contact) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.delete(TABLE_CONTACTS, KEY_ID + " = ?",
//                new String[]{String.valueOf(contact.getID())});
//        db.close();
//    }
//
//    public int getContactsCount() {
//        String countQuery = "SELECT  * FROM " + TABLE_CONTACTS;
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.rawQuery(countQuery, null);
//        cursor.close();
//
//        return cursor.getCount();
//    }

}