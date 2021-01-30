package com.example.filmcatalog.service;


import com.example.filmcatalog.entity.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAll();

    Film getById(Long id);

    Film create(Film film);

    void  deleteById(Long id);

    Film update(Long id, Film film);
}
