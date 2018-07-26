package com.sahurjt.btsparent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class ArrivingBuses extends Response{

    @SerializedName("buses")
    @Expose
    private List<ArrivingBus> arrivingBuses;

    public List<ArrivingBus> getArrivingBuses() {
        return arrivingBuses;
    }
}
