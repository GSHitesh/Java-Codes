package com.Hitesh;

import java.util.Locale;

public class Car {
    private int doors;
    public int wheels;
    private String models;

    public void setModels(String models){
        String validModel = models.toLowerCase();
        if(validModel.equals("zxi") || validModel.equals("lxi")){
            this.models = models; // to update models like the constructor
        }else{
            this.models = "Unknown";
        }


    }

    public String getModels(){
        return this.models;
    }


}
