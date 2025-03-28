package com.K21CNT1.NQK.lesson03.demo.service;

import com.K21CNT1.NQK.lesson03.demo.dto.request.EmployeeRequest;
import com.K21CNT1.NQK.lesson03.demo.entity.Employee;
import com.K21CNT1.NQK.lesson03.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private final EmployeeMapper EmployeeMapper = null;
    private List<Employee> EmployeeList;

    @Autowired
    public EmployeeService(EmployeeMapper EmployeeMapper) {
        EmployeeList = new ArrayList<>();
        EmployeeList.add(new Employee(1, "Nguyễn Văn", "Bình", 12.222f, "binh@gmail.com"));
        EmployeeList.add(new Employee(2, "Nguyễn Thị", "Bình", 20.2312f, "binhthi@gmail.com"));
    }

    public List<EmployeeRequest> getEmployeeList() {
        return EmployeeList.stream()
                .map(EmployeeMapper::toEmployeeRequest)
                .collect(Collectors.toList());
    }

    public void employeeAdd(EmployeeRequest EmployeeRequest) {
        Employee employee = EmployeeMapper.toEmployee(EmployeeRequest);
        EmployeeList.add(employee);
    }

    public void EmployeeAdd(EmployeeRequest employeeRequest) {
    }
}
