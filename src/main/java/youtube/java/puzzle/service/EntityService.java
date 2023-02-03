package youtube.java.puzzle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youtube.java.puzzle.model.Entity;

@Service
public class EntityService {

    @Autowired
    private final CacheService cacheService;

    public EntityService(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    public String saveInCache(int id, String message){
        return cacheService.save(Entity.builder()
                        .id(id)
                        .message(message)
                .build());
    }
}
