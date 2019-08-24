package com.thetripod.foretrail;

import java.util.Date;

public class MissingUsersTertiary {

    private String userId;
    private Date dateTime;
    private String location;
    private String photoId;
    private String description;

    public MissingUsersTertiary(String userId, Date dateTime, String location, String photoId, String description) {
        this.userId = userId;
        this.dateTime = dateTime;
        this.location = location;
        this.photoId = photoId;
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
