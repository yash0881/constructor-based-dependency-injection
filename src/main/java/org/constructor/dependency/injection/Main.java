package org.constructor.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String location = "/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(location);
        Student s = (Student) context.getBean("stdId");
        System.out.println(s);
    }
}