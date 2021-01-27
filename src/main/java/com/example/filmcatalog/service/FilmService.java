package com.example.filmcatalog.service;


import com.example.filmcatalog.entity.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilm();

    Film getByIdFilm(Long id);

    Film createFilm(Film film);

    void  deleteFilmById(Long id);

    Film updateFilm(Long id, Film film);
}
