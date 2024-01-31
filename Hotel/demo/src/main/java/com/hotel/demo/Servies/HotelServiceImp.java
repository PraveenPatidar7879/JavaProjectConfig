package com.hotel.demo.Servies;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.demo.Exception.ResourceNotFoundException;
import com.hotel.demo.entities.Hotel;
import com.hotel.demo.repository.Hotelrepo;
@Service
public class HotelServiceImp implements HoteService {

    @Autowired
    private Hotelrepo hotelRepository;
    @Override
    public Hotel Create(Hotel hotel) {
        // TODO Auto-generated method stub
       String hotelID =UUID.randomUUID().toString();
       hotel.setId(hotelID);
       return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getall() {
        // TODO Auto-generated method stub
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        // TODO Auto-generated method stub
        return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with give id is not found ") );
    }



}
