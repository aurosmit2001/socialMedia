package com.example.onlineplatform.Controller;

import com.example.onlineplatform.Repository.UserRepo;
import com.example.onlineplatform.Service.UserService;
import com.example.onlineplatform.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class controller {

    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String checkMVC() {
        return "login";
    }

    @PostMapping("/register")
    public User createUser(@RequestBody User user) {

        return userService.createUser(user);
    }
    @PostMapping("/login")
    public User getUserByname(@RequestBody User user) {
        return userService.getUserBynameAndpassword(user.getName(), user.getPassword());
    }





}
