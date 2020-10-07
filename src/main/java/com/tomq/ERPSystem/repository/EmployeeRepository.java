package com.tomq.ERPSystem.repository;

import com.tomq.ERPSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
