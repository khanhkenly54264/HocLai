package com.K21CNT1.NQK.lesson11.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "NQK_account")
public class NQK_Account { // Đổi tên class nếu cần
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String NQKUser;
    private String NQKPass;
    private String NQKName;
    private String NQKEmail;
    private String NQKPhone;
    private String NQKAddress;
    private String NQKStatus;

    // Getters, Setters, Constructors
}
