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
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private Date releaseDate;

    private String genre;

    public Film(long id, String name, Date releaseDate, String genre) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public Film() {
    }
}
