package com.is.factory;

import com.is.dao.UserDao;
import com.is.dao.impl.UserDaoImpl;

public class MyBeanFactory2 {
    public UserDao userDao() {
        return new UserDaoImpl();
    }
}
