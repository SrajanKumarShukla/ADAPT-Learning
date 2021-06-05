package com.cg.casestudy.registration.Services;

import java.util.List;


import com.cg.casestudy.registration.Models.User;

public interface UserService {
    
    String createUser(User newUser);
    String updateUser(Long userId);
    String deleteUser(Long userId);
    List<User> displayAllUser();
    User findUserById(Long userId);
    Iterable<User> getUsersByUserType(String userType);
    Iterable<User> getUsersByFirstName(String firstName);

}