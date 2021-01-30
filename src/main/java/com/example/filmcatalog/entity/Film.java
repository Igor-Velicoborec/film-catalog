package com.example.filmcatalog.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="director_id", nullable=false)
    private Director director;

    private String name;

    private Date releaseDate;

    private String genre;


}
