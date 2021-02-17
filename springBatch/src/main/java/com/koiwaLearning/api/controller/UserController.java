package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.User;
import com.koiwaLearning.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "hello"}, method = RequestMethod.GET)
    public List<User> helloWorld() {
        return userService.findAllUsers();
    }
}
