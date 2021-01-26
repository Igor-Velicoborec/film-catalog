package service;

import entity.Director;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DirectorRepository;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    public List<Director> getAllDirector() {
        return directorRepository.findAll();
    }

    @Override
    public Director getByIdDirector(Long id) {
        return directorRepository.getOne(id);
    }

    @Override
    public Director createDirector(Director director) {
        return directorRepository.save(director);
    }

    @Override
    public void deleteDirectorById(@NonNull Long id) {
        directorRepository.deleteById(id);

    }
}
