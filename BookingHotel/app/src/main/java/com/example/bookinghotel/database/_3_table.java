package com.example.bookinghotel.database;

//hotel_details
public class _3_table {
    private String hotel_details_id;
    private String number_of_room;
    private int Size;
    private String description;
    private int Price;
    private String status;
    private int pictute1;
    private int picture2;
    private int picture3;

    public _3_table(String hotel_details_id, String number_of_room, int size, String description, int price, String status, int pictute1, int picture2, int picture3) {
        this.hotel_details_id = hotel_details_id;
        this.number_of_room = number_of_room;
        Size = size;
        this.description = description;
        Price = price;
        this.status = status;
        this.pictute1 = pictute1;
        this.picture2 = picture2;
        this.picture3 = picture3;
    }

    public String getHotel_details_id() {
        return hotel_details_id;
    }

    public void setHotel_details_id(String hotel_details_id) {
        this.hotel_details_id = hotel_details_id;
    }

    public String getNumber_of_room() {
        return number_of_room;
    }

    public void setNumber_of_room(String number_of_room) {
        this.number_of_room = number_of_room;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPictute1() {
        return pictute1;
    }

    public void setPictute1(int pictute1) {
        this.pictute1 = pictute1;
    }

    public int getPicture2() {
        return picture2;
    }

    public void setPicture2(int picture2) {
        this.picture2 = picture2;
    }

    public int getPicture3() {
        return picture3;
    }

    public void setPicture3(int picture3) {
        this.picture3 = picture3;
    }
}
