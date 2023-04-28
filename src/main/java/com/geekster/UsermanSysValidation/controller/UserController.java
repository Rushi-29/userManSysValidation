package com.geekster.UsermanSysValidation.controller;

import com.geekster.UsermanSysValidation.model.User;
import com.geekster.UsermanSysValidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/getUser/{userId}")
    public User getUserById(@PathVariable String userId){
        return userService.getUserById(userId);
    }
    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user) {
        return userService.addNewUser(user);
    }
    @PutMapping(value = "/updateUserInfo/{userId}")
    public void updateInfo(@PathVariable String userId, @RequestBody User user){
         userService.updateUserInfo(userId,user);
    }
    @DeleteMapping(value = "/deleteUser/{userId}")
    public void deleteUserById(@PathVariable String userId){
        userService.deleteUser(userId);
    }

}
