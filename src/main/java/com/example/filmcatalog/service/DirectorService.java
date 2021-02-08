package com.example.filmcatalog.service;

import com.example.filmcatalog.entity.Director;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

public interface DirectorService {

    List<Director> getAll();

    Director getById(Long id);

    Director create(Director director);

   void  deleteById(Long id);

   Director update(Long id, Director director);

     List<Director> find(@Valid @NotNull @RequestParam String name,
                               @RequestParam LocalDate releaseFrom,
                               @RequestParam LocalDate releaseTo);
}
