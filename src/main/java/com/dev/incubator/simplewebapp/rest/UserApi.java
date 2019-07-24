package com.dev.incubator.simplewebapp.rest;

import com.dev.incubator.simplewebapp.service.UserService;
import com.dev.incubator.simplewebapp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
@CrossOrigin
public class UserApi {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUser")
    private List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getUserById/{id}")
    private User getUserById(@PathVariable Long id){
        return userService.find(id);
    }

    @PostMapping("/postUser")
    private void postUser(@RequestBody User user ){
        userService.save(user);
    }

}