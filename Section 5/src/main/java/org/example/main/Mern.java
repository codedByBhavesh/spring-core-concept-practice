package org.example.main;

import org.example.beans.Student;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mern {
    public static void main(String[] args) {

        String resource_file_path = "Bean";

        ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
        Student std =(Student)context.getBean("stdId");
        std.display();
    }




}
