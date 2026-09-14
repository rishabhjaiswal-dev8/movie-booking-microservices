package com.aicines.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController 
@RequestMapping("/movies")
public class MovieController {

    @Autowired 
    private MovieRepository repo;

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return repo.save(movie);
    } 

    @GetMapping
    public List<Movie> getAll() {
        return repo.findAll();
    } 
    

}
