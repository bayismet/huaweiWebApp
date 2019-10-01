package com.example.huawei;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/")
    public ResponseEntity<ArrayList<User>> getAllUsers() {
        return ResponseEntity.ok().body(userService.getAllUsers());

    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(String username, String password) {
        for (User user : userService.getAllUsers()) {
            if (user.username.toString().equals(username) && user.password.toString().equals(password)) {
                return ResponseEntity.ok().body(user);
            }
        }
        
        return ResponseEntity.status(418).body(null);
    }

    @PostMapping("/loginTest")
    public ResponseEntity<String> loginTest(String username, String password) {
        for (User user : userService.getAllUsers()) {
            if (user.username.toString().equals(username) && user.password.toString().equals(password)) {
                return ResponseEntity.ok().body("Logged in successfully!");
            }
        }
        
        return ResponseEntity.status(418).body(null);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(String username, String password) {
        for (User user : userService.userList) {
            if (user.username == username) {
                return ResponseEntity.ok().body("Unavailable username!");

            }
        }
        userService.userList.add(new User(username, password));
        
        return ResponseEntity.ok().body("User registered!");
    }

    @PostMapping("/")
    public ResponseEntity<User> getNewUser(String username, String password) {
        
        return ResponseEntity.ok().body(new User(username, password));
    }

    @PostMapping("/greetings")
    public ResponseEntity<User> getGreetings(User user) {
        
        return ResponseEntity.ok().body(user);
    }
}