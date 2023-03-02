package com.microcomm.user.controller;

import com.microcomm.user.domaine.User;
import com.microcomm.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("register")
    void register(@RequestBody User user) {
        userRepository.save(user);
    }
}
