package com.example.androidinfo.modal;

public class FeatureItemModel {
    private int iconResource; // Resource ID for the icon
    private String title;

    public FeatureItemModel(int iconResource, String title) {
        this.iconResource = iconResource;
        this.title = title;
    }

    public int getIconResource() {
        return iconResource;
    }

    public void setIconResource(int iconResource) {
        this.iconResource = iconResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}