package com.jwt.ssd.controller;

import com.jwt.ssd.pojo.User;
import com.jwt.ssd.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("userController")
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/findByUsername/{username}")
    public User findByUsername(@RequestBody String username) {
        return userService.findByUsername(username);
    }

}
