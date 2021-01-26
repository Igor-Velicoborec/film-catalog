package com.example.filmcatalog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Getter
@Setter
@Entity
public class Director {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


     private String firstName;

     private String lastName;

     private Date birthDate;

    public Director(long id, String firstName, String lastName, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Director() {
    }
}
