package com.company.instagram.models;

public class HomePageModel {
    private int image;
    private String description, date;

    public HomePageModel(int image, String description, String date) {
        this.image = image;
        this.description = description;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
}
