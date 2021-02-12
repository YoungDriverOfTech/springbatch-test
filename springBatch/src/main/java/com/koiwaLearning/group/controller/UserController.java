package com.koiwaLearning.group.controller;

import com.koiwaLearning.group.domain.User;
import com.koiwaLearning.group.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "hello"}, method = RequestMethod.GET)
    public List<User> helloWorld() {
        return userService.findAllUsers();
    }
}
