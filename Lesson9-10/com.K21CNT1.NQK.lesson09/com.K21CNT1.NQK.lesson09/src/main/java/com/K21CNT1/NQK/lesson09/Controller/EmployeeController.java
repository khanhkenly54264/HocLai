package com.K21CNT1.NQK.lesson09.Controller;

import com.K21CNT1.NQK.lesson09.DTO.EmployeeDTO;
import com.K21CNT1.NQK.lesson09.Entity.Employee;
import com.K21CNT1.NQK.lesson09.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<Employee> getAllEmployee(Long id) {
        ResponseEntity<Employee> ok = ResponseEntity.ok(employeeService.updateEmployeeById(id));
        return ok;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) {
        EmployeeDTO employee = employeeService.findById(id).orElse(null);
        return employee != null ? ResponseEntity.ok(employee) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Long employee) {
        ResponseEntity<Employee> ok = ResponseEntity.ok(employeeService.updateEmployeeById(employee));
        return ok;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        Employee employee = employeeService.updateEmployeeById(id);
        if (employee == null) {
            return ResponseEntity.notFound().build();
        }
        // Cập nhật thông tin của nhân viên
        employee.setName(employeeDetails.getName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setPhone(employeeDetails.getPhone());
        return ResponseEntity.ok(employeeService.updateEmployeeById(employee.getId()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        Employee employee = employeeService.updateEmployeeById(id);
        if (employee == null) {
            return ResponseEntity.notFound().build();
        }
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
