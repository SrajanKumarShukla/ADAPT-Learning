package com.cg.casestudy.registration.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.cg.casestudy.registration.Exceptions.RecordNotFoundException;
import com.cg.casestudy.registration.Models.User;
import com.cg.casestudy.registration.Repos.UserRepo;
import com.cg.casestudy.registration.Services.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/users")
public class UserController {
	    @Autowired
	    private UserService userService;

	    @Autowired
	    private UserRepo userRepo;

	    /**
	     * CREATE USER ENDPOINT
	     */
	    @HystrixCommand
	    @PostMapping("/create-user")
	    public String createUser(@RequestBody User newUser){
//	        log.info("User created with Payload: " + newUser);
	        return userService.createUser(newUser);
	    }

	    /**
	     * UPDATE USER ENDPOINT
	     */
	    @HystrixCommand
	    @PutMapping("/update-user/{id}")
	    public String updateUser(@RequestBody User updateUser, @PathVariable("id") Long userId){
//	        log.info("Update User called with ID: " + userId);
	        User existingUser = userRepo.findById(userId)
	                                    .orElseThrow(() -> new RecordNotFoundException(
	                                            "User does not exist with Id: [" + userId + "] ,Please Enter Valid ID!"));
	        existingUser.setFirstName(updateUser.getFirstName());
	        existingUser.setLastName(updateUser.getLastName());
	        existingUser.setEmail(updateUser.getEmail());
	        existingUser.setPassword(updateUser.getPassword());
	        existingUser.setUserType(updateUser.getUserType());
	        userRepo.save(existingUser);
	        return "User updated with User-Id: [" + userId + "]";
	    }

	    /**
	     * GET ALL USERS ENDPOINT
	     */
	    @HystrixCommand
	    @GetMapping("/get-all-users")
	    public List<User> getAllUsers(){
//	        log.info("Get All Users called...");
	        return userService.displayAllUser();
	    }

	    /**
	     * SEARCH USER ENDPOINT
	     */
	    @HystrixCommand
	    @GetMapping("/search-user/{id}")
	    public User getUserById(@PathVariable("id") Long userId){
//	        log.info("Search User called with ID: " + userId);
	        return userService.findUserById(userId);
	    }

	    /**
	     * DELETE USER ENDPOINT
	     */
	    @HystrixCommand
	    @DeleteMapping("/delete-user/{id}")
	    public String deleteUserById(@PathVariable("id") Long userId){
//	        log.info("Delete User called with ID: " + userId);
	        return userService.deleteUser(userId);
	    }

	    /**
	     * SEARCH USER-BY-FIRST_NAME
	     */
	    @HystrixCommand
	    @GetMapping("/search-user-by-firstName/{first_Name}")
	    public Iterable<User> getUsersByFirSTName(@PathVariable("first_Name") String firstName){
//	        log.info("Search Users called with First_Name: " + firstName);
	        return userService.getUsersByFirstName(firstName);
	    }

	    /**
	     * SEARCH USER-BY-TYPE ENDPOINT
	     */
	    @HystrixCommand
	    @GetMapping("/search-user-by-type/{user_type}")
	    public Iterable<User> getUsersByUserType(@PathVariable("user_type") String userType){
//	        log.info("Search User-By-Type called with Type as: " + userType);
	        return userService.getUsersByUserType(userType);
	    }
}
