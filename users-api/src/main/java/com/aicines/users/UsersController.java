package com.aicines.users;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/users")
public class UsersController {
        private final UserRepository repo;
        public UsersController(UserRepository repo){this.repo = repo;}

        @GetMapping
        public List<User> all() { return repo.findAll(); }
        
        @PostMapping
        public User add(@RequestBody User u) { return repo.save(u); }
        
}
