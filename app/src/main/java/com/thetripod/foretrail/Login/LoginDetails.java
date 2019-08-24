package com.thetripod.foretrail.Login;

public class LoginDetails {

    private String userId;
    private String name;
    private String phone;
    private String photoId;

    public LoginDetails(String userId, String name, String phone, String photoId) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.photoId = photoId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
