package com.K21CNT1.NQK.lesson03.demo.service;

import com.K21CNT1.NQK.lesson03.demo.dto.request.EmployeeController;
import com.K21CNT1.NQK.lesson03.demo.entity.Employee;
import com.K21CNT1.NQK.lesson03.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class EmployeeSerrvice {
    @Autowired
    private final EmployeeMapper employeeMapper;
    private List<Employee> employeeList;

    public EmployeeSerrvice(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
        employeeList =new ArrayList<Employee>();
        employeeList.add(new Employee(1,"Nguyễn Văn ","Bình",12.222f,"binh@gmail.com"));
        employeeList.add(new Employee(2,"Nguyễn Thị ","Bình",20.2312f,"binhthi@gmail.com"));
    }
    public List<EmployeeController> getEmployeeList() {
        return employeeList.stream()
                .map(emp-> employeeMapper.toEmployeeRequest(emp)).collect(Collectors.toList());
    }
    public void employeeAdd(EmployeeController employeeRequest) {
//        employeeMapper = new EmployeeMapper();
        Employee employee = employeeMapper.toEmployee(employeeRequest);
        employeeList.add(employee);
    }
}