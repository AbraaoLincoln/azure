package com.test.cosmoDB.constroller;

import com.test.cosmoDB.domain.User;
import com.test.cosmoDB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getUser() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable String id) {
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @GetMapping(path = "/query", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserByName(@RequestParam String name) {
        return ResponseEntity.ok(userService.findByName(name));
    }
}
