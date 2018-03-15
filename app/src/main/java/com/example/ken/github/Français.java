package com.example.ken.github;

/**
 * Created by Ken on 15/03/2018.
 */

public class Français {

    private String Langue;
    private String Description;
    private String Category;
    private int Thumbnail;

    public Français() {
    }

    public Français(String langue, String description, String category, int thumbnail) {
        Langue = langue;
        Description = description;
        Category = category;
        Thumbnail = thumbnail;
    }

    public String getLangue() {
        return Langue;
    }

    public String getDescription() {
        return Description;
    }

    public String getCategory() {
        return Category;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setLangue(String langue) {
        Langue = langue;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}


