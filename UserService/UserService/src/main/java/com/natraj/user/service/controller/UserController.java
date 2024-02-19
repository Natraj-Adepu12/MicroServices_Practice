package com.natraj.user.service.controller;

import com.natraj.user.service.entities.User;
import com.natraj.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //API method to create user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {

       User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //API method to get Single user
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable("userId") String userId){

      User user =  userService.getUser(userId);
      return ResponseEntity.ok(user);
    }

    //API method to get all user

    @GetMapping
    public  ResponseEntity<List<User>> getAllUser() {
       List<User> allUser =  userService.getAllUser();
       return ResponseEntity.ok(allUser);
    }
}
