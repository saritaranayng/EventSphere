package com.eventbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventbooking.model.Event;
public interface EventRepository extends JpaRepository<Event,Long> {    

} 
