package com.user.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ratting {
    private String ratingID;
    private String hotelID;
    private String userID;
    private int rating;
    private String feedback;

     private Hotel hotel;

}
