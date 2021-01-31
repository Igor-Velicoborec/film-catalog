package com.example.filmcatalog.controller;

import com.example.filmcatalog.entity.Director;
import com.example.filmcatalog.entity.Film;
import com.example.filmcatalog.service.DirectorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.filmcatalog.service.FilmService;

import java.util.List;

@RestController
@RequestMapping("/directors/{directorId}/films/")
@Slf4j
public class FilmRestController {

    private final FilmService filmService;


    public FilmRestController(FilmService filmService, DirectorService directorService) {
        this.filmService = filmService;
        this.directorService = directorService;
    }

    private final DirectorService directorService;

    @GetMapping
    public List<Film> getAllFilms(@PathVariable Long directorId) {
        return filmService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Film getById(@PathVariable("id") Long id, @PathVariable Long directorId) {
        return filmService.getById(id);
    }

    @PostMapping
    public void createFilm(@RequestBody Film film, @PathVariable Long directorId) {
        Director director = directorService.getById(directorId);
        if (directorId == null) throw new RuntimeException();
        director.addDirectorFilm(film);
        directorService.update(directorId, director);
    }

    @PutMapping(value = "/{id}")
    public Film updateFilm(@PathVariable("id") Long id, @RequestBody Film film, @PathVariable Long directorId) {
        return filmService.update(id, film);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteFilmById(@PathVariable("id") Long id, @PathVariable String directorId) {
        filmService.deleteById(id);
    }

}
