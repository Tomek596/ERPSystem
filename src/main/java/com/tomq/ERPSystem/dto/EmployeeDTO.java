package com.tomq.ERPSystem.dto;

import com.tomq.ERPSystem.entity.Employee;
import lombok.Data;

@Data
public class EmployeeDTO {

    private Long idEmployee;
    private String firstName;
    private String lastName;
    private String salary;

    public static EmployeeDTO of(Employee employee){
        EmployeeDTO dto = new EmployeeDTO();
        dto.setIdEmployee(employee.getIdEmployee());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setSalary(employee.getSalary());
        return dto;
    }

}
