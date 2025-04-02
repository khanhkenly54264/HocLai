package com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.service;

import com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.dto.UserDTO;
import com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();
    public UserService() {
        userList.add(new User(1L, "user1", "pass1", "john@example.com", "1234567890", 34, "Active"));

    }

    public List<User> findAll() {
        return userList;
    }

    public synchronized String create(UserDTO userDTO) {
        //UserDTO = UserDTO;
        // Kiểm tra trùng lặp username hoặc email
        //UserDTO finalUserDTO = UserDTO;
        Optional<User> existingUser = userList.stream()
                .filter(user -> user.getUsername().equals(userDTO.getUsername()) ||
                        user.getEmail().equals(userDTO.getEmail()))
                .findFirst();

        if (existingUser.isPresent()) {
            return "User already exists with the same username or email.";
        }

        User user = new User(
                (long) (userList.size() + 1), // Giả lập ID tự động tăng
                userDTO.getUsername(),
                userDTO.getPassword(),
                userDTO.getEmail(),
                userDTO.getPhone(),
                userDTO.getAge(),
                userDTO.getStatus()
        );

        userList.add(user);
        return "User created successfully!";
    }
}