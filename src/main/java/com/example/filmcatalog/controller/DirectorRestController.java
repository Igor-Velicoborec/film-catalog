package com.example.filmcatalog.controller;


import com.example.filmcatalog.entity.Director;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.example.filmcatalog.service.DirectorService;

import java.util.List;

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

    @GetMapping(value = "/{id}")
    public Director getById(@PathVariable("id")Long id){
       return directorService.getById(id);
    }
    @PostMapping
    public Director create(@RequestBody Director director){
        return directorService.create(director);
    }
    @PutMapping(value = "/{id}")
    public Director update(@PathVariable("id")Long id,@RequestBody Director director){
        return directorService.update(id, director);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable("id") Long id){
        directorService.deleteById(id);
    }
}
