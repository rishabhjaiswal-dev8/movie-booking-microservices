package com.aicines.users;

import com.aicines.users.client.MovieClient;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController 
@RequestMapping("/users")
public class UsersController {
        private final UserRepository repo;
        private final MovieClient movieClient;


        public UsersController(UserRepository repo, MovieClient movieClient){
                this.repo = repo;
                this.movieClient = movieClient;
        }

        @GetMapping
        public List<User> all() { return repo.findAll(); }
        
        @PostMapping
        public User add(@RequestBody User u) { return repo.save(u); }

        @GetMapping("/{id}/with-movies")
        public Map<String, Object> getUserWithMovies(@PathVariable Long id) {
                User user = repo.findById(id).orElse(null);
                Map<String, Object> response = new HashMap<>();
                response.put("user", user);
                response.put("movies", movieClient.getAllMovies());
                return response;
        }
        
}
