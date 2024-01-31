package com.user.demo.Entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_service")
public class User {
    @Id
    public String userId;
    public String  Name;
    public  String email;
    public String about;

    
    //Below notation will not allow to save this value to the database 
    @Transient
    private List<Ratting> ratings;

  
}
