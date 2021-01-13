package com.example.carownersapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "carowners")

public class CarOwners {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String carModel;
    private String year;
    private String color;
    private String gender;
    private String title;
    private String bio;

    public CarOwners(int id, String firstName, String lastName, String email, String country, String carModel, String year, String color, String gender, String title, String bio) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.carModel = carModel;
        this.year = year;
        this.color = color;
        this.gender = gender;
        this.title = title;
        this.bio = bio;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    @Override
    public String toString() {
        return "CarOwners{" +
                "firstname='" + firstName + '\'' +
                ", lastname=" + lastName +
                ", email=" + email +
                ", country=" + country +
                ", carmodel=" + carModel +
                ", year=" + year +
                ", colour=" + color +
                ", gender=" + gender +
                ", title=" + title +
                ", bio=" + bio +
                '}';
    }
}