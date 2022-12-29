package com.example.bookinghotel.database;

//recycle view trong list history, có doing, done, cancel
public class _2_table {
    public String name_hotel;
    public String address_hotel;
    public String number_of_room_hotel_detail;
    public int price_hotel_detail;
    public int picture_hotel;
    //Others
    public String number_of_day_other;

    public _2_table(int _picture_hotel, String _name_hotel, int _price_hotel_detail,
                    String _number_of_day_other, String _number_of_room_hotel_detail,
                    String _address_hotel) {
        picture_hotel = _picture_hotel;
        name_hotel = _name_hotel;
        price_hotel_detail = _price_hotel_detail;
        number_of_day_other = _number_of_day_other;
        number_of_room_hotel_detail = _number_of_room_hotel_detail;
        address_hotel = _address_hotel;
    }
}
