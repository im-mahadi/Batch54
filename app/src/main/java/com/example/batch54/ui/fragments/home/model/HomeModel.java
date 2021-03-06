package com.example.batch54.ui.fragments.home.model;

public class HomeModel {
    private String url;
    private String title;
    private String author;
    private String date;

    public HomeModel(String url, String title, String author, String date) {
        this.url = url;
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
