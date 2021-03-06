package com.example.batch54.ui.fragments.home.model;

import android.net.Uri;

public class StoryModel {
    private Uri uri;
    private String title;
    private String author;
    private String date;

    public StoryModel(Uri uri, String title, String author, String date, String upvote, String downvote) {
        this.uri = uri;
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
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
