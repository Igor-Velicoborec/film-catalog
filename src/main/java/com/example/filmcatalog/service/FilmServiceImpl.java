package com.example.filmcatalog.service;


import com.example.filmcatalog.entity.Film;
import org.springframework.stereotype.Service;
import com.example.filmcatalog.repository.FilmRepository;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> getAllFilm() {
        return filmRepository.findAll();
    }

    @Override
    public Film getByIdFilm(Long id) {
        return filmRepository.getOne(id);
    }

    @Override
    public Film createFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public void deleteFilmById(Long id) {
        filmRepository.deleteById(id);
    }
}
