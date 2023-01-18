package com.is.test;

import com.is.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ApplicationContextTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object userService = applicationContext.getBean("userService");
//        System.out.println(userService);
//        Object userDao1 = applicationContext.getBean("userDao1");
//        System.out.println(userDao1);
//        Object userDao2 = applicationContext.getBean("userDao2");
//        System.out.println(userDao2);
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        userService.show();


//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName();
//        dataSource.setUrl();
//        dataSource.setUsername();
//        dataSource.setPassword();
//        Object dataSource = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);
//        Object connection = applicationContext.getBean("connection");
//        System.out.println(connection);


//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = simpleDateFormat.parse("2023-8-27 12:00:00");


//        Object date = applicationContext.getBean("date");
//        System.out.println(date);

//==================================================================
//        //静态工厂方法
//        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
//        //无参构造实例化
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        //实例工厂方法
//        SqlSessionFactory sqlSessionFactory = builder.build(in);

//        SqlSessionFactory sqlSessionFactory =(SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
//        System.out.println(sqlSessionFactory);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        System.out.println(sqlSession);


//        Object personDao = applicationContext.getBean("personDao");
//        System.out.println(personDao);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.show();
    }
}
