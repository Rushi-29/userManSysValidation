package com.geekster.UsermanSysValidation.repo;

import com.geekster.UsermanSysValidation.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepo {

    List<User> userList = new ArrayList<>();
    public List<User> getUsers() {
        return userList;
    }

    public String save(User user) {
        userList.add(user);
        return "Added Successfully...!!!";
    }

    public void update(String userId, User user) {
        for (User userObj : userList) {
            if (userObj.getUserId().equals(userId)) {
                userObj.setUsername(user.getUsername());
                userObj.setPhoneNumber(user.getPhoneNumber());
            }
        }
    }

    public void delete(User user) {
        userList.remove(user);
    }

}
