package com.example.bookinghotel.database;

public class review {
    private int Id;
    private int hotel_id;
    private float rate;
    private String content;
    private int avatar;
    private String create_by;
    private int delete;

    public review(int id, int hotel_id, float rate, String content, int avatar, String create_by, int delete) {
        this.Id = id;
        this.hotel_id = hotel_id;
        this.rate = rate;
        this.content = content;
        this.avatar = avatar;
        this.create_by = create_by;
        this.delete = delete;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }
}
