package com.is.service.impl;

import com.is.dao.UserDao;
import com.is.service.UserService;
import jakarta.servlet.ServletContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;


//public class UserServiceImpl implements UserService, InitializingBean {

//    private UserDao userDao;
//BeanFactory去调用该方法 从容器中获得userDao设置到此处
//    public void init() {
//        System.out.println("初始化...");
//    }
//    public void destroy() {
//        System.out.println("销毁...");
//    }
////    public UserServiceImpl() {
////        System.out.println("UserServiceImpl无参构造方法执行");
////    }
//    public UserServiceImpl(String name) {
//        System.out.println("UserServiceImpl有参构造方法执行");
//    }
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//        System.out.println("属性设置完毕...");
//        System.out.println("BeanFactory去调用该方法获得userDao设置到此处:" + userDao);
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet执行...");
//    }
//}
public class UserServiceImpl implements UserService, ServletContextAware, ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private UserDao userDao;
//    private List<String> stringList;
//    private List<UserDao> userDaoList;
//    private Set<String> stringSet;
//    private Set<UserDao> userDaoSet;
//    private Map<String,UserDao> map;
//    private Properties properties;
//
//    public void setStringList(List<String> stringList) {
//        this.stringList = stringList;
//    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void show() {
//        System.out.println(stringList);
//        System.out.println(userDaoList);
//        System.out.println(stringSet);
//        System.out.println(userDaoSet);
//        System.out.println(map);
//        System.out.println(properties);
        System.out.println(userDao);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println(servletContext);
    }


//
//    public void setUserDaoList(List<UserDao> userDaoList) {
//        this.userDaoList = userDaoList;
//    }
//
//    public void setStringSet(Set<String> stringSet) {
//        this.stringSet = stringSet;
//    }
//
//    public void setUserDaoSet(Set<UserDao> userDaoSet) {
//        this.userDaoSet = userDaoSet;
//    }
//
//    public void setMap(Map<String, UserDao> map) {
//        this.map = map;
//    }
//
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }
}
