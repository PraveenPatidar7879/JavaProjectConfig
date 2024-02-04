package com.user.demo.Controller;

import java.util.List;
import ch.qos.logback.classic.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import com.user.demo.Entity.User;
import com.user.demo.Services.UserServices;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/users")
public class UserController { 

    @Autowired
    private UserServices userService;

    private Logger logger=(Logger) LoggerFactory.getLogger(UserController.class);

    //create
    @PostMapping
     public ResponseEntity<User> createUser(@RequestBody User user)
     {
      //  User user1 =userService.saveUser(user);
       /// return ResponseEntity.status(HttpStatus.CREATED).body(user1);
      return   ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));
     }

    //single user get
    int retrycount=1;
    @GetMapping("/{userId}")
    //@CircuitBreaker(name="ratingHotelBreaker",fallbackMethod ="ratingHotelFallback")
    //@Retry(name="ratingHotelService",fallbackMethod="ratingHotelFallback")
    @RateLimiter(name="userRatingLimiter",fallbackMethod = "ratingHotelFallback")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId)
    {
      logger.info("Get Single User Handler: UserController");
      logger.info("Retry count: {}",retrycount);
      retrycount++;
      User user=userService.getUser(userId);
      return ResponseEntity.ok(user);
    }
// creating call back method for circuitbraker
   public ResponseEntity<User> ratingHotelFallback(String userid,Exception ex)
   { {
      
     logger.info("Fallback is executed because service is down:",ex.getMessage());
     User user= User.builder()
      .email("Praveenpatidar7879@gmail.com")
      .Name("Praveen Patiar").about("This is coming because some services are down ")
      .userId("322r3efvd").build();
     return new ResponseEntity<>(user,HttpStatus.OK);
   }
  }
    //all user get 
    @GetMapping
    public ResponseEntity<List<User>> getAllUser()
    {
        List<User> allUser=userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

}

