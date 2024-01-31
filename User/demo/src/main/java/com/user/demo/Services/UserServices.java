package com.user.demo.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.user.demo.Entity.User;



@Service
public interface UserServices {

   
    User saveUser(User usr);

    // Get all user 
    List<User> getAllUser();

    User getUser(String userId);

    
    

}
