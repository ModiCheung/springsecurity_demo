package com.jwt.ssd.service;

import com.jwt.ssd.pojo.User;

public interface UserService {

    public User findByUsername(String username);
}
