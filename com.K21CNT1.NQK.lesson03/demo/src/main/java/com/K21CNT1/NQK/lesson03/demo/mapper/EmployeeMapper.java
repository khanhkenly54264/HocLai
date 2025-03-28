package com.K21CNT1.NQK.lesson03.demo.mapper;

import com.K21CNT1.NQK.lesson03.demo.dto.request.EmployeeRequest;
import com.K21CNT1.NQK.lesson03.demo.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    // Chuyển từ EmployeeRequest -> Employee (Mặc định salary = 0)
    @Mapping(target = "salary", constant = "0")
    Employee toEmployee(EmployeeRequest employeeRequest);

    // Chuyển từ Employee -> EmployeeRequest
    EmployeeRequest toEmployeeRequest(Employee employee);
}
