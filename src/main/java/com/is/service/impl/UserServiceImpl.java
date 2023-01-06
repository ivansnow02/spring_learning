package com.is.service.impl;

import com.is.dao.UserDao;
import com.is.service.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean {
    private UserDao userDao;
    //BeanFactory去调用该方法 从容器中获得userDao设置到此处
    public void init() {
        System.out.println("初始化...");
    }
    public void destroy() {
        System.out.println("销毁...");
    }
//    public UserServiceImpl() {
//        System.out.println("UserServiceImpl无参构造方法执行");
//    }
    public UserServiceImpl(String name) {
        System.out.println("UserServiceImpl有参构造方法执行");
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("属性设置完毕...");
        System.out.println("BeanFactory去调用该方法获得userDao设置到此处:" + userDao);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet执行...");
    }
}
