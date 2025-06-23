package br.com.api.pellegrino.controllers;

import br.com.api.pellegrino.models.User;
import br.com.api.pellegrino.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public Iterable<br.com.api.pellegrino.models.User> getUsers() {
        return this.userRepository.findAll();
    }

    @PostMapping("/create-user")
    public User addOneUser(@RequestBody br.com.api.pellegrino.models.User user) {
        return this.userRepository.save(user);
    }
}
