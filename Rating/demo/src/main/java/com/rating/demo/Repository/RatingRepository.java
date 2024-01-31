package com.rating.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.demo.Entities.Rating;

public interface RatingRepository extends JpaRepository<Rating,String>{
     
   List<Rating> findByuserID(String userID);
   List<Rating> findByhotelID(String hotelId);
}
