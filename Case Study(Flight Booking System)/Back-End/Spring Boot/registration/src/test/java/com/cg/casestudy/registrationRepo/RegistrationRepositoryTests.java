package com.cg.casestudy.registrationRepo;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cg.casestudy.registration.Config.SequenceGeneratorService;
import com.cg.casestudy.registration.Models.User;
import com.cg.casestudy.registration.Repos.UserRepo;

@SpringBootTest

class RegistrationRepositoryTests {

    @Mock
    private UserRepo userRepo;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @BeforeEach
    public void setUp(){
        //user  = new User("","","email","","");
    }
    @AfterEach
    public void tearDown(){
        userRepo.deleteAll();
    }

    
    @Test
    public void testFindUserByEmail(){
        String email = "abc";
        User user1 = new User("sagar","","abc","","");
        when(userRepo.findUserByEmail(email)).thenReturn(user1);
        assertEquals("sagar",userRepo.findUserByEmail(email).getFirstName());
    }

    
    @Test
    public void testFindUsersByUserType(){
        String userType = "USER";
        List<User> userList= new ArrayList<User>();
        User user1 = new User("sagar","","","","USER");
        userList.add(user1);
        userRepo.save(user1);
        when(userRepo.findUsersByUserType(userType)).thenReturn(userList);
        assertEquals(userList,userRepo.findUsersByUserType(userType));
    }

    @Test
    public void testFindUsersByFirstName(){
        String userFirstName = "Sagar";
        List<User> userList= new ArrayList<User>();
        User user = new User("sagar","","","","USER");
        userList.add(user);
        userRepo.save(user);
        when(userRepo.findUsersByUserType(userFirstName)).thenReturn(userList);
        assertEquals(userList,userRepo.findUsersByUserType(userFirstName));
    }

}
