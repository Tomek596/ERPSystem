package com.tomq.ERPSystem.controller;

import com.tomq.ERPSystem.dto.EmployeeDTO;
import com.tomq.ERPSystem.entity.Employee;
import com.tomq.ERPSystem.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;                                                                //dzieki lombokowi da rade bez @Autowired

    @PostMapping("/employees")
    public EmployeeDTO newEmployee(@RequestBody EmployeeDTO newEmployee){
        return EmployeeDTO.of(employeeRepository.save(Employee.of(newEmployee)));
    }

    @GetMapping("/employees")
    public List<EmployeeDTO> listEmployees(){
        return employeeRepository.findAll()
                .stream()
                .map(EmployeeDTO::of)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/employees")
    public ResponseEntity deleteEmployee(@RequestBody Long idEmployee){
        employeeRepository.deleteById(idEmployee);
        return ResponseEntity.ok().build();
    }
}
