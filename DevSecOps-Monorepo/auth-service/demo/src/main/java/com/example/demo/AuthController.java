package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/auth/status")
    public String status() {
        return "Auth Service is running!";
    }

    @PostMapping("/auth/register")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}