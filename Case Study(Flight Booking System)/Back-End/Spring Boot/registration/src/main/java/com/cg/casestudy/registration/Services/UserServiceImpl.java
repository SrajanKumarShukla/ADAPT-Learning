package com.cg.casestudy.registration.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.casestudy.registration.Config.SequenceGeneratorService;
import com.cg.casestudy.registration.Exceptions.RecordAlreadyPresentException;
import com.cg.casestudy.registration.Exceptions.RecordNotFoundException;
import com.cg.casestudy.registration.Models.User;
import com.cg.casestudy.registration.Repos.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @Override
    public String createUser(User newUser) {
        Optional<User> existingUser = Optional.ofNullable(userRepo.findUserByEmail(newUser.getEmail()));
        if(existingUser.isEmpty()){
            newUser.setUserId(sequenceGeneratorService.generateSequence(User.SEQUENCE_NAME));
            userRepo.save(newUser);
            return "You have successfully created an Account with Email-Id: " + newUser.getEmail();
        } else {
            throw new RecordAlreadyPresentException("Please Enter Unique Email!" + " " +
                    "User already exists with Email-ID: " + newUser.getEmail());
        }
    }

    @Override
    public String updateUser(Long userId) {
        return null;
    }

    @Override
    public List<User> displayAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User findUserById(Long userId) {
        return userRepo.findById(userId).orElseThrow(()->new RecordNotFoundException
                ("User does not exist with ID: [" + userId + "] ,Please Enter Valid ID!"));
    }

    @Override
    public String deleteUser(Long userId) {
        User existingUser = userRepo.findById(userId).orElseThrow(()->
                new RecordNotFoundException("User does not exist with ID: [" + userId + "] ,Please Enter Valid ID!"));
        userRepo.delete(existingUser);
        return "User deleted with Id: " + userId;

    }

    @Override
    public Iterable<User> getUsersByFirstName(String firstName) {
        return userRepo.findUsersByFirstName(firstName);
    }

    @Override
    public Iterable<User> getUsersByUserType(String userType) {
        return userRepo.findUsersByUserType(userType);
    }
}
