package com.example.filmcatalog.controller;

import com.example.filmcatalog.entity.Film;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.example.filmcatalog.service.FilmService;

import java.util.List;

@RestController
@RequestMapping("/films")
@Slf4j
public class FilmRestController {

    private final FilmService filmService;

    public FilmRestController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> getAllFilms(){
        return filmService.getAllFilm();
    }

    @GetMapping(value = "/{id}")
    public Film getById(@PathVariable("id")Long id){
        return filmService.getByIdFilm(id);
    }
    @PostMapping
    public Film createFilm(@RequestBody Film film){
        return filmService.createFilm(film);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteFilmById(@PathVariable("id") Long id){
        filmService.deleteFilmById(id);
    }

}
