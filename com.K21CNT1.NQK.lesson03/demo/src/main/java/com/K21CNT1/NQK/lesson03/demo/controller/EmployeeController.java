package com.K21CNT1.NQK.lesson03.demo.controller;

import com.K21CNT1.NQK.lesson03.demo.dto.request.EmployeeRequest;
import com.K21CNT1.NQK.lesson03.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public List<EmployeeRequest> getAllEmployeeRequestList() {
        return employeeService.getEmployeeList();
    }

    @PostMapping("/add")
    public void employeeAdd(@RequestBody EmployeeRequest employeeRequest) {
        employeeService.employeeAdd(employeeRequest);
    }
}
