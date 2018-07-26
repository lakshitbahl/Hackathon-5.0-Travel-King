package com.sahurjt.btsparent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class RideStatus extends Response{
    @SerializedName("rides")
    @Expose
    private String rides;

    public String getRideStatus(){
        return rides;
    }
}
