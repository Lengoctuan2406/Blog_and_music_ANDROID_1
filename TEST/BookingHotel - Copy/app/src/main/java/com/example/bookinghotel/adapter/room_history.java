package com.example.bookinghotel.adapter;

public class room_history {
    private int imgRoomHistory;
    private String nameHotelHistory;
    private int priceRoomHistory;
    private double statusRoomHistory;
    private String typeRoomHistory;
    private String stayDate;
    private String addressRoomHistory;
    private String starRoomHistory;

    public String getStarHotelHistory() {
        return starRoomHistory;
    }

    public void setStarHotelHistory(String starRoomHistory) {
        this.starRoomHistory = starRoomHistory;
    }

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

    public String getStayDate() {
        return stayDate;
    }

    public void setStayDate(String stayDate) {
        this.stayDate = stayDate;
    }

    public String getAddressRoomHistory() {
        return addressRoomHistory;
    }

    public void setAddressRoomHistory(String addressRoomHistory) {
        this.addressRoomHistory = addressRoomHistory;
    }

    public room_history(int imgRoomHistory, String nameHotelHistory, int priceRoomHistory, double statusRoomHistory, String typeRoomHistory, String stayDate, String addressRoomHistory) {
        this.imgRoomHistory = imgRoomHistory;
        this.nameHotelHistory = nameHotelHistory;
        this.priceRoomHistory = priceRoomHistory;
        this.statusRoomHistory = statusRoomHistory;
        this.typeRoomHistory = typeRoomHistory;
        this.stayDate = stayDate;
        this.addressRoomHistory = addressRoomHistory;
    }
    public room_history(int imgRoomHistory, String nameHotelHistory, int priceRoomHistory, double statusRoomHistory, String typeRoomHistory, String stayDate, String addressRoomHistory, String starRoomHistory) {
        this.imgRoomHistory = imgRoomHistory;
        this.nameHotelHistory = nameHotelHistory;
        this.priceRoomHistory = priceRoomHistory;
        this.statusRoomHistory = statusRoomHistory;
        this.typeRoomHistory = typeRoomHistory;
        this.stayDate = stayDate;
        this.addressRoomHistory = addressRoomHistory;
        this.starRoomHistory = starRoomHistory;
    }
}
