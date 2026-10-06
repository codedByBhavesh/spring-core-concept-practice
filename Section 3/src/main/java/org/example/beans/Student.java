package org.example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("bhavesh")
    private String name;

    @Value("101")
    private int rollNo;

    @Value("80")
    private float marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public void display(){
        System.out.println("Name = "+name);
        System.out.println("Roll num = "+rollNo);
        System.out.println("Total marks = "+marks);
    }
}
