package com.is.service.impl;

import com.is.dao.UserDao;
import com.is.service.UserService;

public class UserServiceImpl implements UserService {
    //BeanFactory去调用该方法 从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao) {
        System.out.println("BeanFactory去调用该方法获得userDao设置到此处:" + userDao);
    }
}
