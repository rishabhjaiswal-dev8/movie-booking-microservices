package com.aicines.movies;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController 
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository repo;

    MovieController(MovieRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return repo.save(movie);
    } 

    @GetMapping
    public List<Movie> getAll() {
        return repo.findAll();
    } 
    

}
