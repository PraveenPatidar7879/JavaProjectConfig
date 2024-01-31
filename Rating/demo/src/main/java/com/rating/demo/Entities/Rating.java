package com.rating.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Rating")
public class Rating {
    @Id
    private String ratingID;
    private String hotelID;
    private String userID;
    private int rating;
    private String feedback;

}
