package com.K21CNT1.NQK.lesson09.Service;

import com.K21CNT1.NQK.lesson09.Entity.Employee;
import com.K21CNT1.NQK.lesson09.DTO.EmployeeDTO;
import com.K21CNT1.NQK.lesson09.Respository.EmployeeRespository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
@NoArgsConstructor
public class EmployeeService {

    private EmployeeRespository employeeRespository;

    @Autowired
    public EmployeeService(EmployeeRespository employeeRespository) {
        this.employeeRespository = employeeRespository;
    }

    public List<Employee> findAll() {
        return employeeRespository.findAll();
    }

    public Optional<EmployeeDTO> findById(Long id) {
        Employee employee = employeeRespository.findById(id).orElse(null);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(id);
        employeeDTO.setName(employee.getName());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setPhone(employee.getPhone());
        employeeDTO.setAddress(employee.getAddress());
        employeeDTO.setBirth(employee.getBirthday());
        employeeDTO.setStatus(employee.getStatus());

        return Optional.of(employeeDTO);
    }

    public Boolean save(EmployeeDTO employeeDTO) {
        Employee employee = new Employee ();
        employeeDTO.setName(employeeDTO.getName());
        employeeDTO.setEmail(employeeDTO.getEmail());
        employeeDTO.setAddress(employeeDTO.getAddress());
        employeeDTO.setBirth(employeeDTO.getBirth());
        employeeDTO.setStatus(employeeDTO.getStatus());
        try {
            employeeRespository.save(employee);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Employee updateEmployeeById(Long id) {
        return employeeRespository.findById(id)
                .map(employee -> {
                    employee.setId(employee.getId());
                    employee.setName(employee.getName());
                    employee.setEmail(employee.getEmail());
                    employee.setPhone(employee.getName());
                    employee.setAddress(employee.getAddress());
                    employee.setBirthday(employee.getBirthday());
                    employee.setStatus(employee.getStatus());
                    return employeeRespository.save(employee);
                })
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee ID: " + id));
    }

    public void deleteEmployee(Long id) {
        employeeRespository.deleteById(id);
    }
}