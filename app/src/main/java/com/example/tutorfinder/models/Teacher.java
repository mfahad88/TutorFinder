package com.example.tutorfinder.models;

import android.graphics.drawable.Drawable;

public class Teacher {
    private Drawable image;
    private String name;
    private String degree;
    private String experience;
    private String course;
    private String review;

    public Teacher(Drawable image, String name, String degree, String experience, String course, String review) {
        this.image = image;
        this.name = name;
        this.degree = degree;
        this.experience = experience;
        this.course = course;
        this.review = review;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
