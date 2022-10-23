package com.example.bookinghotel.adapter;

public class blog {
    private int imgBlog;
    private String nameBlog;
    private String addressBlog;
    private String desBlog;

    public int getImgBlog() {
        return imgBlog;
    }

    public void setImgBlog(int imgBlog) {
        this.imgBlog = imgBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getAddressBlog() {
        return addressBlog;
    }

    public void setAddressBlog(String addressBlog) {
        this.addressBlog = addressBlog;
    }

    public String getDesBlog() {
        return desBlog;
    }

    public void setDesBlog(String desBlog) {
        this.desBlog = desBlog;
    }

    public blog(int imgBlog, String nameBlog, String addressBlog, String desBlog) {
        this.imgBlog = imgBlog;
        this.nameBlog = nameBlog;
        this.addressBlog = addressBlog;
        this.desBlog = desBlog;
    }
}
