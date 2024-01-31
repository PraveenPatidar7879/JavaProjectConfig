package com.hotel.demo.controller;

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

import com.hotel.demo.Servies.HoteService;
import com.hotel.demo.entities.Hotel;

@RestController
@RequestMapping("/hotels")
public class HotelController {


    @Autowired HoteService hotelService;

    //create
    @PostMapping
   public ResponseEntity<Hotel> CreateHotel(@RequestBody Hotel hotel)
   {
      System.out.println("I am in");
    return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.Create(hotel));
   }

    //get single
    @GetMapping("/{hotelID}")
    public ResponseEntity<Hotel> CreateHotel(@PathVariable String hotelID)
    {
    
     return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelID));
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getall(){
        return ResponseEntity.ok(hotelService.getall());
    } 



}
