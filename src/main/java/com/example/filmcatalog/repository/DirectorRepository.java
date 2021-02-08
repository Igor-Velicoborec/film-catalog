package com.example.filmcatalog.repository;

import com.example.filmcatalog.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {


    List<Director> findDirectorsByFilmsReleaseDateIsBetween (LocalDate from, LocalDate to);

    List<Director> findDirectorsByFilmsReleaseDateAfter (LocalDate from);

    List<Director> findDirectorsByFilmsReleaseDateBefore(LocalDate to);















}
