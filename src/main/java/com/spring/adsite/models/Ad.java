package com.spring.adsite.models;

import java.util.Date;

public class Ad {
    private long id;
    private long userID;
    private String title;
    private String description;
    //date the ad was created.
    private Date creationDate;

    public Ad(long userID, String title, String description) {
        this.userID = userID;
        this.title = title;
        this.description = description;
    }

    public Ad(long id, long userID, String title, String description, Date creationDate) {
        this.id = id;
        this.userID = userID;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return creationDate;
    }

    public void setDate(Date date) {
        this.creationDate = date;
    }
}
