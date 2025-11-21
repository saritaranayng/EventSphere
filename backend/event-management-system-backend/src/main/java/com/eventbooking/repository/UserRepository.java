package com.eventbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventbooking.model.User;
public interface UserRepository extends JpaRepository<User,Long> {   

} 
