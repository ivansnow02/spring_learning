package com.is.factory;

import com.is.dao.UserDao;
import com.is.dao.impl.UserDaoImpl;

public class MyBeanFactory1 {
    public static UserDao userDao() {
        return new UserDaoImpl();
    }
}
