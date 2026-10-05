package org.example.main;
import org.example.beans.Student;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        String config_file = "Bean";

        ApplicationContext context =
                new ClassPathXmlApplicationContext(config_file);

        Student student = context.getBean("stdId", Student.class);

        student.display();

    }
}
