package com.example.batch54.models;

public class UpcomingModel {
    private String title;
    private String date;
    private String details;


    public UpcomingModel(String title, String date, String details) {
        this.title = title;
        this.date = date;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
