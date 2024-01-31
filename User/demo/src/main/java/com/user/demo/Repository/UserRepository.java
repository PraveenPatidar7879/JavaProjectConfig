package com.user.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.user.demo.Entity.User;

//JpaRepository<User,String> where String is the type of primary key 
public interface UserRepository extends JpaRepository<User,String> {



}
