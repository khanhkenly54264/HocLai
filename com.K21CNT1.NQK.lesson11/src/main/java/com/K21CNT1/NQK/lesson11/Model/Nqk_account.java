package com.K21CNT1.NQK.lesson11.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Nqk_account")
public class Nqk_account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nqk_user", nullable = false, unique = true)
    private String Nqk_User;

    @Column(name = "Nqk_pass", nullable = false)
    private String Nqk_Pass;

    @Column(name = "Nqk_name", nullable = false)
    private String Nqk_Name;

    @Column(name = "Nqk_email", nullable = false, unique = true)
    private String Nqk_Email;

    @Column(name = "Nqk_phone", nullable = false)
    private String Nqk_Phone;

    @Column(name = "Nqk_address")
    private String Nqk_Address;

    @Column(name = "Nqk_status")
    private Boolean Nqk_Status;

}
