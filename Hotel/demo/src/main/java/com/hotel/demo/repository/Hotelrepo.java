package com.hotel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.demo.entities.Hotel;

public interface Hotelrepo extends JpaRepository<Hotel,String> {
    

    
} 

