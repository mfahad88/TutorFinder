package com.example.tutorfinder.models;

import android.graphics.drawable.Drawable;

public class Carousel {
    private Drawable image;

    public Carousel(Drawable image) {
        this.image = image;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
