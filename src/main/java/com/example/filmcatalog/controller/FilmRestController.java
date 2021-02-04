package com.example.filmcatalog.controller;

import com.example.filmcatalog.entity.Director;
import com.example.filmcatalog.entity.Film;
import com.example.filmcatalog.service.DirectorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.example.filmcatalog.service.FilmService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/directors/{directorId}/films/")
@Slf4j
public class FilmRestController {

    private final FilmService filmService;
    private final DirectorService directorService;

    public FilmRestController(FilmService filmService, DirectorService directorService) {
        this.filmService = filmService;
        this.directorService = directorService;
    }


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
        if (director == null) throw new RuntimeException();
        director.addDirectorFilm(film);
        directorService.update(directorId, director);
    }

    @PutMapping(value = "/{id}")
    public Film updateFilm(@PathVariable("id") Long id, @RequestBody Film filmDetails, @PathVariable Long directorId) {
        Optional<Film> film = Optional.ofNullable(filmService.getById(id));
        Film newFilm = film.get();
        newFilm.setGenre(filmDetails.getGenre());
        newFilm.setId(filmDetails.getId());
        newFilm.setName(filmDetails.getName());
        newFilm.setReleaseDate(filmDetails.getReleaseDate());
        return filmService.update(id, newFilm);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteFilmById(@PathVariable("id") Long id, @PathVariable String directorId) {
        Optional<Film> film = Optional.ofNullable(filmService.getById(id));
        Film newFilm = film.get();
        filmService.deleteById(id);
    }

}
