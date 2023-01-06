package com.is.test;

import com.is.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        System.out.println(userService);
        Object userDao1 = applicationContext.getBean("userDao1");
        System.out.println(userDao1);
    }
}
