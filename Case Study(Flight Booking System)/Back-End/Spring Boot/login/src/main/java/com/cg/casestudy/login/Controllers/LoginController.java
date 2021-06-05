package com.cg.casestudy.login.Controllers;


import com.cg.casestudy.login.Models.UserRequest;
import com.cg.casestudy.login.Service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

 
    /**
     * VALIDATE USER CREDENTIALS
     */
    @PostMapping
    public Object validateUser(@RequestBody UserRequest userResponse){
//        log.info("Tried Log-In with Credentials as: \n" + userResponse);
        return loginService.validateUser(userResponse);
    }

}
