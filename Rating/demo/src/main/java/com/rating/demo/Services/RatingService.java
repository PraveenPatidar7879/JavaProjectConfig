package com.rating.demo.Services;

import java.util.List;

import com.rating.demo.Entities.Rating;

public interface RatingService {



    //create
     Rating create(Rating rating);

    //Get all rating 
    List<Rating> getRating();

    //get all by users id

    List<Rating> getRatingByUserId(String userid);
    

    //get all by hotely
     List<Rating> getRatingByHotelId(String hotelId);
    
}
