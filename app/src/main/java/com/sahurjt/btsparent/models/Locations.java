package com.sahurjt.btsparent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class Locations extends Response {
    // record for location history
    @SerializedName("locations")
    @Expose
    private List<LocationHistory> locations;

    public List<LocationHistory> getLocations() {
        return locations;
    }

}
