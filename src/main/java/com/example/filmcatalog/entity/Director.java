package com.example.filmcatalog.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Film> films= new ArrayList<>();


    private String firstName;

    private String lastName;

    private Date birthDate;



}
