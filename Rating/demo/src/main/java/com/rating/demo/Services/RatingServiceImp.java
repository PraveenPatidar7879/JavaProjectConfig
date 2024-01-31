package com.rating.demo.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.demo.Entities.Rating;
import com.rating.demo.Repository.RatingRepository;

@Service
public class RatingServiceImp implements RatingService{
    
    @Autowired
    private RatingRepository repository;

    @Override
    public Rating create(Rating rating) {
        
       String ratID =UUID.randomUUID().toString();
       rating.setRatingID(ratID);
        return repository.save(rating);
    }

    @Override
    public List<Rating> getRating() {
        
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
    
        return repository.findByuserID(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        
        return repository.findByhotelID(hotelId);
    }

}
