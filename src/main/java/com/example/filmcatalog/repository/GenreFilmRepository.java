package com.example.filmcatalog.repository;

import com.example.filmcatalog.entity.GenreFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreFilmRepository extends JpaRepository<GenreFilm, Long> {
}
