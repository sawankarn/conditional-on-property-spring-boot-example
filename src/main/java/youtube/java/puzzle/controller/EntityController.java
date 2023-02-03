package youtube.java.puzzle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youtube.java.puzzle.service.CacheService;
import youtube.java.puzzle.service.EntityService;

@RestController
@RequestMapping("/api")
public class EntityController {
    @Autowired
    EntityService entityService;
    @GetMapping("/save/{id}/{message}")
    public String saveDataInCache(@PathVariable("id") int id, @PathVariable("message") String message){
        return entityService.saveInCache(id, message);
    }
}
