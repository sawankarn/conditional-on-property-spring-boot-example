package youtube.java.puzzle.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import youtube.java.puzzle.service.CacheService;
import youtube.java.puzzle.service.InMemoryServiceImpl;
import youtube.java.puzzle.service.RedisServiceImpl;

@Configuration
public class CacheConfiguration {
    @Bean
    @ConditionalOnProperty(prefix = "app.cache.layer", name="type", havingValue = "redis")
    public CacheService redisCacheService(){
        return new RedisServiceImpl();
    }

    @Bean
    @ConditionalOnProperty(prefix = "app.cache.layer", name="type", havingValue = "in-memory")
    public CacheService inMemoryCacheService(){
        return new InMemoryServiceImpl();
    }

}
