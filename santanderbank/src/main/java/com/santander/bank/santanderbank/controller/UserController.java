package com.santander.bank.santanderbank.controller;

import com.santander.bank.santanderbank.domain.model.User;
import com.santander.bank.santanderbank.service.UserService;
import com.santander.bank.santanderbank.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){

        var user = userService.findById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping("/{id}")
    public ResponseEntity<User> create(@RequestBody User user){

        var createUser = userService.createUser(user);

        URI locationUser = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createUser.getId())
                .toUri();

        return ResponseEntity.created(locationUser).body(createUser);
    }

}
