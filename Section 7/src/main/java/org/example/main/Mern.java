package org.example.main;

//import org.springframework.context.ApplicationContext;
import org.example.Config.AppConfig;
import org.example.beans.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mern {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Laptop std = context.getBean(Laptop.class);
        std.display();


    }




}
