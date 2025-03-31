package com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.mapper;

import com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.dto.UserDTO;
import com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.entity.User;

public class UserMapper {

    // Convert UserDTO to User
    public static User toEntity(UserDTO UserDTO) {
        return new User(
                null, // ID will be generated automatically, set to null for now
                UserDTO.getUsername(),
                UserDTO.getPassword(),
                UserDTO.getEmail(),
                UserDTO.getPhone(),
                UserDTO.getAge(),
                UserDTO.getStatus()
        );
    }

    // Convert User to UserDTO
    public static UserDTO toDTO(User User) {
        return new UserDTO(
                User.getUsername(),
                User.getPassword(),
                User.getEmail(),
                User.getPhone(),
                User.getAge(),
                User.getStatus()
        );
    }
}
