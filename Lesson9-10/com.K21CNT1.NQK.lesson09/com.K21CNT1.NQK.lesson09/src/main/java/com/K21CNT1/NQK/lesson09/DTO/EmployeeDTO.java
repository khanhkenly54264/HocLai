package com.K21CNT1.NQK.lesson09.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long Id;
    private String Name;
    private String Email;
    private String Phone;
    private String Address;
    private String Birth;
    private String Status;
}