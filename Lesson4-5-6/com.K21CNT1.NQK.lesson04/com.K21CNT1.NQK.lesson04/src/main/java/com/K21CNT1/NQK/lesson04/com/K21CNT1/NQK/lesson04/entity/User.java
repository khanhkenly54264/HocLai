package com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder

public class User {
    Long id;
    String username;
    String password;
    String email;
    String phone;
    int age;
    String Status;

    public User(Long id, String username, String password, String email, String phone, int age, String status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.Status = status;
    }
}
