package youtube.java.puzzle.service;

import youtube.java.puzzle.model.Entity;

public class RedisServiceImpl implements CacheService{
    @Override
    public String save(Entity entity) {
        System.out.println("RedisServiceImpl.save");
        return "RedisServiceImpl.save => Id::"+entity.getId()+" Message::"+entity.getMessage();
    }
}
