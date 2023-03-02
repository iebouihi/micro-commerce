package com.microcomm.user.controller;

import com.microcomm.user.domaine.User;
import com.microcomm.user.exceptions.UserAlreadyExitsException;
import com.microcomm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("register")
    void register(@RequestBody User user) {
        try {
            userService.register(user);
        } catch (UserAlreadyExitsException uaee) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "User Already Exists");
        }


    }
}
