package com.eventbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.eventbooking.model.Event;
import com.eventbooking.service.EventService;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }
}
