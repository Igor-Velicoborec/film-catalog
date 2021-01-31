package com.example.filmcatalog.service;

import com.example.filmcatalog.entity.Director;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.filmcatalog.repository.DirectorRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepository directorRepository;

    @Autowired
    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }
    @Transactional
    @Override
    public List<Director> getAll() {
        return directorRepository.findAll();
    }
    @Transactional
    @Override
    public Director getById(Long id) {
        return directorRepository.getOne(id);
    }
    @Transactional
    @Override
    public Director create(Director director) {
        return directorRepository.save(director);
    }
    @Transactional
    @Override
    public void deleteById(@NonNull Long id) {
        directorRepository.deleteById(id);

    }
    @Transactional
    @Override
    public Director update(Long id, Director director) {
        return directorRepository.save(director);
    }
}
