package org.example.beans;

public class Battery {
    private String Battery_Brand;

    public String getBattery_Brand() {
        return Battery_Brand;
    }

    public void setBattery_Brand(String battery_Brand) {
        Battery_Brand = battery_Brand;
    }
    @Override
    public String toString(){
        return "#"+Battery_Brand;
    }
}
