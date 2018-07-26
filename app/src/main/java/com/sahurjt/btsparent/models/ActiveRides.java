package com.sahurjt.btsparent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class ActiveRides extends Response {
    @SerializedName("rides")
    @Expose
    private List<ActiveRide> rides;

    public List<ActiveRide> getRides(){
        return rides;
    }
}
