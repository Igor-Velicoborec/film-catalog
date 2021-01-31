package com.example.filmcatalog.service;


import com.example.filmcatalog.entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.filmcatalog.repository.FilmRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    @Transactional
    @Override
    public List<Film> getAll() {
        return filmRepository.findAll();
    }

    @Transactional
    @Override
    public Film getById(Long id) {
        return filmRepository.getOne(id);
    }

    @Transactional
    @Override
    public Film create(Film film) {
        return filmRepository.save(film);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }

    @Transactional
    @Override
    public Film update(Long id, Film film) {
        return filmRepository.save(film);
    }
}
