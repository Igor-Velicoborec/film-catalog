package com.example.filmcatalog.service;

import com.example.filmcatalog.entity.Director;

import java.util.List;

public interface DirectorService {

    List<Director> getAll();

    Director getById(Long id);

    Director create(Director director);

   void  deleteById(Long id);

   Director update(Long id, Director director);
}
