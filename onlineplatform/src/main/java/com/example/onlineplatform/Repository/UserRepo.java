package com.example.onlineplatform.Repository;

import com.example.onlineplatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer>{


User findByName(String userName);

    User findByname(String username);
}
