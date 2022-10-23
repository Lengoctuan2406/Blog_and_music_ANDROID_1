package com.example.bookinghotel.adapter;

public class room_history {
    private int imgRoomHistory;
    private String nameHotelHistory;
    private int priceRoomHistory;
    private double statusRoomHistory;
    private String typeRoomHistory;
    private int roomNo;
    private int dayRoomHistory;
    private int nightRoomHistory;
    private String addressRoomHistory;

    public int getImgRoomHistory() {
        return imgRoomHistory;
    }

    public void setImgRoomHistory(int imgRoomHistory) {
        this.imgRoomHistory = imgRoomHistory;
    }

    public String getNameHotelHistory() {
        return nameHotelHistory;
    }

    public void setNameHotelHistory(String nameHotelHistory) {
        this.nameHotelHistory = nameHotelHistory;
    }

    public int getPriceRoomHistory() {
        return priceRoomHistory;
    }

    public void setPriceRoomHistory(int priceRoomHistory) {
        this.priceRoomHistory = priceRoomHistory;
    }

    public double getStatusRoomHistory() {
        return statusRoomHistory;
    }

    public void setStatusRoomHistory(double statusRoomHistory) {
        this.statusRoomHistory = statusRoomHistory;
    }

    public String getTypeRoomHistory() {
        return typeRoomHistory;
    }

    public void setTypeRoomHistory(String typeRoomHistory) {
        this.typeRoomHistory = typeRoomHistory;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getDayRoomHistory() {
        return dayRoomHistory;
    }

    public void setDayRoomHistory(int dayRoomHistory) {
        this.dayRoomHistory = dayRoomHistory;
    }

    public int getNightRoomHistory() {
        return nightRoomHistory;
    }

    public void setNightRoomHistory(int nightRoomHistory) {
        this.nightRoomHistory = nightRoomHistory;
    }

    public String getAddressRoomHistory() {
        return addressRoomHistory;
    }

    public void setAddressRoomHistory(String addressRoomHistory) {
        this.addressRoomHistory = addressRoomHistory;
    }


    public room_history(int imgRoomHistory, String nameHotelHistory, int priceRoomHistory, double statusRoomHistory, String typeRoomHistory, int roomNo, int dayRoomHistory, int nightRoomHistory, String addressRoomHistory) {
        this.imgRoomHistory = imgRoomHistory;
        this.nameHotelHistory = nameHotelHistory;
        this.priceRoomHistory = priceRoomHistory;
        this.statusRoomHistory = statusRoomHistory;
        this.typeRoomHistory = typeRoomHistory;
        this.roomNo = roomNo;
        this.dayRoomHistory = dayRoomHistory;
        this.nightRoomHistory = nightRoomHistory;
        this.addressRoomHistory = addressRoomHistory;
    }
}
