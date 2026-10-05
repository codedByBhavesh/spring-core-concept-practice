package org.example.main;
import org.example.beans.Hotel;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(org.example.config.AppConfig.class);
        Hotel info = (Hotel)context.getBean("hotelId");
        info.display();



    }
}
