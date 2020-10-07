package com.tomq.ERPSystem.controller;

import com.tomq.ERPSystem.entity.Employee;
import com.tomq.ERPSystem.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;                                                                //dzieki lombokowi da rade bez @Autowired

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee){
        return employeeRepository.save(newEmployee);
    }

    @GetMapping("/employees")
    List<Employee> listEmployees(){
        return employeeRepository.findAll();
    }

    @DeleteMapping("/employees")
    ResponseEntity deleteEmployee(@RequestBody Long idEmployee){
        employeeRepository.deleteById(idEmployee);
        return ResponseEntity.ok().build();
    }
}
