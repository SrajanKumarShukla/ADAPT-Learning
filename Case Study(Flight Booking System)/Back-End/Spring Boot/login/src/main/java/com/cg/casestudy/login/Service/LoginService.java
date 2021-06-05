package com.cg.casestudy.login.Service;

import com.cg.casestudy.login.Models.UserRequest;

public interface LoginService {
    /**
     * LOGIN USER VALIDATION
     */
    Object validateUser(UserRequest userRequest);
}
