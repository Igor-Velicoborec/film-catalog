package service;

import entity.Director;

import java.util.List;

public interface DirectorService {

    List<Director> getAllDirector();

    Director getByIdDirector(Long id);

    Director createDirector(Director director);

   void  deleteDirectorById(Long id);
}
