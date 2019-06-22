package com.example.lvcustomadapater;

public class Restuarant {
    String name;
    String rating;
    String locationLink;
    public Restuarant(String Name,String Rating,String Location)
    {
        this.name=Name;
        this.rating=Rating;
        this.locationLink=Location;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public String getLocationLink() {
        return locationLink;
    }
}
