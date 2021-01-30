package com.example.filmcatalog.service;

import com.example.filmcatalog.entity.Director;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import com.example.filmcatalog.repository.DirectorRepository;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    public List<Director> getAll() {
        return directorRepository.findAll();
    }

    @Override
    public Director getById(Long id) {
        return directorRepository.getOne(id);
    }

    @Override
    public Director create(Director director) {
        return directorRepository.save(director);
    }

    @Override
    public void deleteById(@NonNull Long id) {
        directorRepository.deleteById(id);

    }

    @Override
    public Director update(Long id, Director director) {
        return directorRepository.save(director);
    }
}
