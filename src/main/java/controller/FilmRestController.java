package controller;

import entity.Director;
import entity.Film;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.FilmService;

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
    public List<Film> getAllFilm(){
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
    @DeleteMapping
    public void deleteFilmById(Long id){
        filmService.deleteFilmById(id);
    }

}
