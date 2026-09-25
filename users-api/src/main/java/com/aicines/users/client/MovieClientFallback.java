package com.aicines.users.client;

import org.springframework.stereotype.Component;
import java.util.*;

@Component 
public class MovieClientFallback implements MovieClient {
    

            @Override 
            public List<Map<String, Object>> getAllMovies() {
                Map<String, Object> fallback = new HashMap<>();
                fallback.put("id", 0);
                fallback.put("title", "Movies service is DOWN - Fallback response");
                fallback.put("message", "Circuit Breaker is OPEN");
                return List.of(fallback);
            }

            @Override 
            public Map<String, Object> getMovieById(Long id)  {
                Map<String, Object> fallback = new HashMap<>();
                fallback.put("id", id);
                fallback.put("title", "Movies data not available");
                fallback.put("fallback", true);
                fallback.put("message", "Movie service down, returning fallback");
                return fallback;
            }
}
