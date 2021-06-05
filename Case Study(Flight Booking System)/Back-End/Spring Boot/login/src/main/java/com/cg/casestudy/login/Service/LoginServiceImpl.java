package com.cg.casestudy.login.Service;

import com.cg.casestudy.login.Models.User;
import com.cg.casestudy.login.Models.UserRequest;
import com.cg.casestudy.login.Repos.LoginRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService{
  
    @Autowired
    private LoginRepo loginRepo;

    @Override
    public Object validateUser(UserRequest userRequest) {
        Optional<User> user = Optional.ofNullable(loginRepo.findUserByEmail(userRequest.getEmail()));
        if(user.isPresent()){
            User existingUser = user.get();
            String existingUserPassword = existingUser.getPassword();
            if(existingUserPassword.equals(userRequest.getPassword())){
                return user;
            } else {
                return "Invalid Password!";
            }
        } else {
            return "User Email not found!";
        }
    }

}
