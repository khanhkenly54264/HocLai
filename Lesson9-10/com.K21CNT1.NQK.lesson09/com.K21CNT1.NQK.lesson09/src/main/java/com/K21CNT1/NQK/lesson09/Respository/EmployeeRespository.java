package com.K21CNT1.NQK.lesson09.Respository;

import com.K21CNT1.NQK.lesson09.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {
}