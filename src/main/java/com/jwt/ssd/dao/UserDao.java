package com.jwt.ssd.dao;

import com.jwt.ssd.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public User findByUsername(String username);
}
