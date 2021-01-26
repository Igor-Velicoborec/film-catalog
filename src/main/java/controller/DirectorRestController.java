package controller;


import entity.Director;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DirectorService;

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
    public List<Director> getAllDirector(){
        return directorService.getAllDirector();
    }

    @GetMapping(value = "/{id}")
    public Director getById(@PathVariable("id")Long id){
       return directorService.getByIdDirector(id);
    }
    @PostMapping
    public Director createDirector(@RequestBody Director director){
        return directorService.createDirector(director);
    }
    @DeleteMapping
    public void deleteDirectorById(Long id){
        directorService.deleteDirectorById(id);
    }
}
