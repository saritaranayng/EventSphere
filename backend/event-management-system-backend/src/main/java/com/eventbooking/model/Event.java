package com.eventbooking.model;

import java.time.LocalDateTime;

import jakarta.persistence .*;

@Entity
@Table(name="events")

public class Event
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;
 
    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDateTime start_date;

    @Column(nullable = false)
    private LocalDateTime end_date;

    @Column(nullable = false)
    private Integer capacity;

    @ManyToOne
    @JoinColumn(name="organiser_id",nullable = false)
    private User organiser;

    // constructors
    public Event(){};

    public Event(String title,String description,String location,Integer capacity,String category,LocalDateTime start_date,LocalDateTime end_date)
    {
           this.title=title;
           this.description=description;
           this.location=location;
           this.capacity=capacity;
           this.category=category;
           this.start_date=start_date;
           this.end_date=end_date;

    }
// getter and setter methods

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}

    public String getTitle(){return title;};
    public void setTitle(String title){this.title=title;}

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public LocalDateTime getStart_date() { return start_date; }
    public void setStart_date(LocalDateTime start_date) { this.start_date = start_date; }

    public LocalDateTime getEnd_date() { return end_date; }
    public void setEnd_date(LocalDateTime end_date) { this.end_date = end_date; }

    public Integer getCapacity() { return capacity; }
    public void setCapacity(Integer capacity) { this.capacity = capacity; }

   
}



