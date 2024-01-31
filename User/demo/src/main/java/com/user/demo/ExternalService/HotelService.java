package com.user.demo.ExternalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.demo.Entity.Hotel;

@FeignClient(name="HOTEL-SERVICES")
public interface HotelService {


    @GetMapping("/hotels/{hotelId}")
    Hotel getHotel(@PathVariable String hotelId);
}
