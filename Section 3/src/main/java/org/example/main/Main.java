package org.example.main;
import org.example.beans.Student;
import org.springframework.context.ApplicationContext;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        String resource_file_path = "Bean";
        ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
        Student std = (Student) context.getBean("student");
        std.display();


    }
}
