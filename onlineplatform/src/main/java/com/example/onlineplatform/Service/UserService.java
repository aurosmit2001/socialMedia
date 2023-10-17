package com.example.onlineplatform.Service;

import com.example.onlineplatform.Repository.UserRepo;
import com.example.onlineplatform.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public User createUser(User user) {
        return userRepo.save(user);
    }
    public User getUserBynameAndpassword(String name, String password) {
        User user =userRepo.findByname(name);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }

        return null;
    }






}
