package com.user.demo.ExternalService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.user.demo.Entity.Ratting;

@FeignClient(name="RATING-SERVICES")
public interface RattingService {

    //Get
    @GetMapping("ratings/users/{userID}")
    List<Ratting> getRatting(@PathVariable String userID);

}
