package org.example.beans;

public class Hotel {
    private String name;
    private String location;
    private  int room;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void display(){
        System.out.println("Name ="+name);
        System.out.println("Location = "+location);
        System.out.println("Totl Room = "+room);
        System.out.println("Rating = "+rating);
    }
}
