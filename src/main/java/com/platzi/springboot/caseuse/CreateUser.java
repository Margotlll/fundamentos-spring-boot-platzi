package com.platzi.springboot.caseuse;

import com.platzi.springboot.entity.User;
import com.platzi.springboot.services.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {
    private UserService userService;

    public CreateUser(UserService userService)
    {
        this.userService = userService;
    }

    public User save(User newUser) {
        return userService.save(newUser);
    }
}
