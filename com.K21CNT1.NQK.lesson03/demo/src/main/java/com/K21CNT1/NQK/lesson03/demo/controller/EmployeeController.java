package com.K21CNT1.NQK.lesson03.demo.controller;

import com.K21CNT1.NQK.lesson03.demo.service.EmployeeSerrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeSerrvice employeeService ;

    @GetMapping("")
    public List<com.K21CNT1.NQK.lesson03.demo.dto.request.EmployeeController> getAllEmployeeRequestList(){
        return employeeService.getEmployeeList();
    }

    @PostMapping("/add")
    public void employeeAdd(@RequestBody com.K21CNT1.NQK.lesson03.demo.dto.request.EmployeeController employeeRequest){
        employeeService.employeeAdd(employeeRequest);
    }
}
