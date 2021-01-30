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
    public List<Film> getAll() {
        return filmRepository.findAll();
    }

    @Override
    public Film getById(Long id) {
        return filmRepository.getOne(id);
    }

    @Override
    public Film create(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }

    @Override
    public Film update(Long id, Film film) {
        return filmRepository.save(film);
    }
}
