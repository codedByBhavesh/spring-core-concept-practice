package org.example.beans;

public class Feature {
    private String Ram ;
    private String SSD;

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    @Override
    public String toString(){
        return "#" + Ram +"-"+ SSD;
    }
}
