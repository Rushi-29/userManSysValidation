package com.geekster.UsermanSysValidation.service;

import com.geekster.UsermanSysValidation.model.User;
import com.geekster.UsermanSysValidation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User getUserById(String userId) {
        List<User> helperList = getAllUsers();
        for ( User user : helperList ) {
            if ( user.getUserId().equals(userId) ) {
                return user;
            }
        }
        return null;
    }


    public List<User> getAllUsers() {
        return userRepo.getUsers();
    }


    public String addNewUser(User user) {
        return userRepo.save(user);
    }

    public void updateUserInfo(String userId, User user) {
         userRepo.update(userId,user);
    }

    public void deleteUser(String userId) {
        List<User> helperList = getAllUsers();
        for (User user : helperList) {
            if (user.getUserId().equals(userId)) {
                 userRepo.delete(user);
            }
        }
    }
}
