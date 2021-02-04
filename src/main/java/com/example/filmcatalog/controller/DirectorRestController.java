package com.example.filmcatalog.controller;


import com.example.filmcatalog.entity.Director;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.example.filmcatalog.service.DirectorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/directors")
@Slf4j
public class DirectorRestController {

    private final DirectorService directorService;

    public DirectorRestController(DirectorService directorService) {
        this.directorService = directorService;
    }
    @GetMapping
    public List<Director> getAll(){
        return directorService.getAll();
    }
    @Transactional
    @GetMapping(value = "/{id}")
    public Director getById(@PathVariable("id")Long id){
       return directorService.getById(id);
    }
    @PostMapping
    public Director create(@RequestBody Director director){
        return directorService.create(director);
    }
    @PutMapping(value = "/{id}")
    public Director update(@PathVariable("id")Long id,@RequestBody Director directorDetails){
        Optional<Director>  director= Optional.ofNullable(directorService.getById(id));
        Director newDirector=director.get();
        newDirector.setId(directorDetails.getId());
        newDirector.setFilms(directorDetails.getFilms());
        newDirector.setFirstName(directorDetails.getFirstName());
        newDirector.setLastName(directorDetails.getLastName());
        newDirector.setBirthDate(directorDetails.getBirthDate());
        return directorService.update(id, newDirector);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable("id") Long id){
        Optional<Director> directorOptional= Optional.ofNullable(directorService.getById(id));
        Director director=directorOptional.get();
        directorService.deleteById(id);
    }
}
