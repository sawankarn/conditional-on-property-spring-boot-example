package youtube.java.puzzle.service;

import youtube.java.puzzle.model.Entity;

public class InMemoryServiceImpl implements CacheService{
    @Override
    public String save(Entity entity) {
        System.out.println("InMemoryServiceImpl.save");
        return "InMemoryServiceImpl.save => Id::"+entity.getId()+" Message::"+entity.getMessage();
    }
}
