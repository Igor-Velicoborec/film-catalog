package com.example.filmcatalog.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import javax.persistence.*;

@Data
@Entity
@Proxy(lazy = false)
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class BoxOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String country;

    private double boxOffice;

    @OneToOne
    private Film film;
}
