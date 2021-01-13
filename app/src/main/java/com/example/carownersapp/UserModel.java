package com.example.carownersapp;

import java.io.Serializable;

public class UserModel implements Serializable {
    private String id;
    private String avatar;
    private String fullName;
    private String date;
    private String createdAt;
    private String gender;
    private String []color;
    private String []countries;

    public UserModel(String id, String avatar, String fullName, String date, String createdAt, String gender, String[] color, String[] countries) {
        this.id = id;
        this.avatar = avatar;
        this.fullName = fullName;
        this.createdAt = createdAt;
        this.gender = gender;
        this.color = color;
        this.countries = countries;
        this.date = date;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
