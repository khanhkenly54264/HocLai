package com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.controller;

import com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.dto.UserDTO;
import com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.entity.User;
import com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    @Autowired
    private UserService UserService;

    @GetMapping("/user-list")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = UserService.findAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/user-add")
    public ResponseEntity<String> addUser(@Valid @RequestBody UserDTO UserDTO) {
        String result = UserService.create(UserDTO);
        if (result.equals("User created successfully!")) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.badRequest().body(result);
        }
    }

}
