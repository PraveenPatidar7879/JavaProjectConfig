package com.rating.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.demo.Entities.Rating;
import com.rating.demo.Services.RatingService;

@RestController
@RequestMapping("/ratings")     
public class RatingController {
    @Autowired
    private RatingService ratingService;

    //create rating
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating)
    {
     return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }
   

     @GetMapping
     public ResponseEntity<List<Rating>> getRatings()
     {
        return ResponseEntity.ok(ratingService.getRating());
     }


    //get all by user id
    @GetMapping("/users/{userID}") 
    public ResponseEntity<List<Rating>> getRatingBYUserId(@PathVariable String userID)
    {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userID));
    };

    //get all
    @GetMapping("hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingbyHotelID(@PathVariable String hotelId)
    {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    };


}
