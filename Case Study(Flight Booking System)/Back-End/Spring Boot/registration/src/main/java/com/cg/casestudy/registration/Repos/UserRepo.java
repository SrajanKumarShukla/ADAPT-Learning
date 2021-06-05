package com.cg.casestudy.registration.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.cg.casestudy.registration.Models.User;

@Repository
public interface UserRepo extends MongoRepository<User, Long> {

    User findUserByEmail(String userEmail);
    Iterable<User> findUsersByUserType(String userType);
    Iterable<User> findUsersByFirstName(String userFirstName);
}