package com.eventsphere.model;

import jakarta.persistence.*;

@Entity
@Table(name="users")

public class User{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable=false)
    private String name;

   @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private String role;

    @Column(nullable=true)
    private String phone;

    // constructor
    public User(){};

    public User(String name,String email,String password,String role,String phone)
    {
        this.name=name;
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

    public String getName()
    {
        return name;
    }
     
    public void setName(String name)
    {
        this.name=name;
    }

    public String getEmail()
    {
        return email;
    }
     
    public void setEmail(String email)
    {
        this.email=email;
    }

    public String setPassword()
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
} 