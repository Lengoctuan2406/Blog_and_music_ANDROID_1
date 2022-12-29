package com.example.bookinghotel.database;

//load ra các recycle view các khách sạn hiện có
public class _1_table {
    public String name_hotel;
    public String address_hotel;
    public int price_hotel_detail;
    public int status_hotel_detail;
    public int picture_hotel;
    //Others
    public String number_of_day_other;
    public String type_other;

    public _1_table(int _picture_hotel, String _name_hotel, int _price_hotel_detail,
                    int _status_hotel_detail, String _number_of_day_other,
                    String _address_hotel, String _type_other) {
        picture_hotel = _picture_hotel;
        name_hotel = _name_hotel;
        price_hotel_detail = _price_hotel_detail;
        status_hotel_detail = _status_hotel_detail;
        number_of_day_other = _number_of_day_other;
        address_hotel = _address_hotel;
        type_other = _type_other;
    }
}
