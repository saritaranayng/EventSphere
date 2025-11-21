package com.eventbooking.model;

import jakarta.persistence.*;
import java.util.List;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotNull;



@Entity
@Table(name="users")

public class User{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;

    @NotBlank(message = "First_Name is required")
    @Column(nullable=false)
    private String first_name;

    
    @Column(nullable=true)
    private String last_name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid Email format")
    @Column(nullable=false,unique = true)
    private String email;
     
    @NotBlank(message ="Password is required")
    @Column(nullable=false)
    private String password;

    @NotBlank(message = "Role is required")
    @Column(nullable=false)
    private String role;

    @Column(nullable=true)
    private String phone;

    @OneToMany(mappedBy = "organiser")
    private List<Event> events;
    // constructor
    public User(){};

    public User(String first_name,String last_name,String email,String password,String role,String phone)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.password=password;
        this.role=role;
        this.phone=phone;
    }

    // getter and setter methods

    public Long getId()
    {
        return Id;
    }
     
    public void setId(Long Id)
    {
        this.Id=Id;
    }

    public String getfirst_Name()
    {
        return first_name;
    }
     
    public void setfirst_Name(String first_name)
    {
        this.last_name=first_name;
    }

    public String getlast_Name()
    {
        return last_name;
    }
     
    public void setlast_Name(String last_name)
    {
        this.last_name=last_name;
    }


    public String getEmail()
    {
        return email;
    }
     
    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getPassword()
    {
        return password;
    }
     
    public void setPassword(String password)
    {
        this.password=password;
    }

    public String getPhone()
    {
        return phone;
    }
     
    public void setPhone(String phone)
    {
        this.phone=phone;
    }

    public String getRole()
    {
        return role;
    }
     
    public void setRole(String role)
    {
        this.role=role;
    }

    public List<Event> getEvents(){return events;}
    public void setEvents(List<Event> events){this.events=events;}
} 