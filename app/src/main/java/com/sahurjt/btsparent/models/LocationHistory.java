package com.sahurjt.btsparent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class LocationHistory implements Comparable{
    // hold single history

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("gps")
    @Expose
    private String gps;


    @SerializedName("time")
    @Expose
    private String time;

    public int getId(){return id;}
    public String getLocationTime() {
        return time;
    }

    public String getGps() {
        return gps;
    }

    @Override
    public int compareTo(Object o) {
        LocationHistory ids=(LocationHistory)o;
        return this.id-ids.getId();
    }
}
