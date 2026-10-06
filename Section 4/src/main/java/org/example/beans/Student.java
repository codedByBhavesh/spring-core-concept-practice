package org.example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {

     private String name;
      private int rollNo;
      private float mark;
      private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        System.out.println("Name = "+name);
        System.out.println("RollNo = "+rollNo);
        System.out.println("Total Marks = "+mark);
        System.out.println("Home Address = "+address);
    }
}
