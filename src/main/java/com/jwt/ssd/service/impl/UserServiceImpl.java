package com.jwt.ssd.service.impl;

import com.jwt.ssd.dao.UserDao;
import com.jwt.ssd.pojo.User;
import com.jwt.ssd.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
