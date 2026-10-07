package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop {
    private String laptop_Brand;
    private int price;
    private String Battery;

    @Autowired
    @Qualifier("featureId1")   //to remove confusion between same name bean for choose only 1
    private Feature feature;

    public String getLaptop_Brand() {
        return laptop_Brand;
    }

    public void setLaptop_Brand(String laptop_Brand) {
        this.laptop_Brand = laptop_Brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String battery) {
        Battery = battery;
    }

    public void display(){
        System.out.println("Laptop_Company_Name = "+laptop_Brand);
        System.out.println("Price = "+price);
        System.out.println("Laptop Feature = "+feature);
        System.out.println("Battery Brand = "+Battery);
    }
}
