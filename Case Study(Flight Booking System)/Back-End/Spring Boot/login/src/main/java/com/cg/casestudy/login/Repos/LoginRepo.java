package com.cg.casestudy.login.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.casestudy.login.Models.User;

@Repository
public interface LoginRepo extends MongoRepository<User, Long> {
    /**
     * CUSTOM METHOD FOR FETCHING LOGIN INFO
     */
    User findUserByEmail(String userEmail);
}
