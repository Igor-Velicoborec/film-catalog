package service;


import entity.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilm();

    Film getByIdFilm(Long id);

    Film createFilm(Film film);

    void  deleteFilmById(Long id);
}
