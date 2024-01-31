package com.user.demo.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;
import com.user.demo.Entity.Hotel;
import com.user.demo.Entity.Ratting;
import com.user.demo.Entity.User;
import com.user.demo.Exception.ResourcesNotFoundException;
import com.user.demo.ExternalService.HotelService;
import com.user.demo.ExternalService.RattingService;
import com.user.demo.Repository.UserRepository;

import ch.qos.logback.classic.Logger;
@Service
public class UserServiceImpl implements UserServices {
    
    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HotelService hotelservice;

    @Autowired
    private RattingService rattingservice;
  
    private Logger logger =(Logger) LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {
        
       String userID =UUID.randomUUID().toString();
       user.setUserId(userID);
       return userRepo.save(user);

    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        return userRepo.findAll();
    }

    @Override
    public User getUser(String userId) {
        // TODO Auto-generated method stub
      User usr=   userRepo.findById(userId).orElseThrow(()-> new ResourcesNotFoundException("User with given id is not found "+ userId));
      //fetch ratting of the above user from Ratting Service
   // Ratting[] ratingOfUser= restTemplate.getForObject("http://RATING-SERVICES/ratings/users/"+userId,Ratting[].class);
      List<Ratting> ratingOfUser =rattingservice.getRatting(userId);

       
  // List<Ratting> ratings= Arrays.stream(ratingOfUser).toList();

       usr.setRatings(ratingOfUser);
       logger.info("{} "+ratingOfUser);
       
     List<Ratting> ratingList=ratingOfUser.stream().map(rating->
       {
        //api call to hotel service to get the hotel
     //  ResponseEntity<Hotel> forEntity= restTemplate.getForEntity("http://Hotel-Services/hotels/"+rating.getHotelID(),Hotel.class);
      

//set the hotel to rating 
    //  Hotel hotel=forEntity.getBody();
    Hotel hotel=hotelservice.getHotel(rating.getHotelID());
     // logger.info("response status code:",forEntity.getStatusCode());
        //return the status;
        rating.setHotel(hotel);
        return rating;
       }).collect(Collectors.toList());
       usr.setRatings(ratingList);
       return usr;
    }
}
