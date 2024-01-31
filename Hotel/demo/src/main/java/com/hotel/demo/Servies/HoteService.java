package com.hotel.demo.Servies;

import java.util.List;

import com.hotel.demo.entities.Hotel;

public interface HoteService {

      //create
      Hotel Create(Hotel hotel);

      //getall
      List<Hotel> getall();
  
      //Get single
      Hotel get(String id);
} 