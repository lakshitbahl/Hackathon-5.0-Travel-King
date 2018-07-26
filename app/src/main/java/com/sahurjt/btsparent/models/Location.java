package com.sahurjt.btsparent.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sahurjt.btsparent.interfaces.ApiInterface;


public class Location extends Response{


    @SerializedName("gps")
    @Expose
    private String gps;


    @SerializedName("last_update")
    @Expose
    private String lastUpdate;

    public String getLastUpdate() {
        return lastUpdate;
    }

    public String getGps() {
        return gps;
    }

    public boolean isCompleted() {
        return this.getStatus() != null && this.getStatus().equals(ApiInterface.STATUS_COMPLETED);
    }
}
