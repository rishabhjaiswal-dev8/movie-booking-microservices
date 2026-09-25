package com.aicines.users.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Map;

@FeignClient(name = "MOVIES-API", fallback = MovieClientFallback.class)
public interface MovieClient {

        @GetMapping("/movies")
        List<Map<String, Object>> getAllMovies();

        @GetMapping("/movies/{id}")
        Map<String, Object> getMovieById(@PathVariable("id") Long id);
}
