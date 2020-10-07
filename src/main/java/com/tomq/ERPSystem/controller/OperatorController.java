package com.tomq.ERPSystem.controller;

import com.tomq.ERPSystem.entity.Operator;
import com.tomq.ERPSystem.repository.OperatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OperatorController {

    private final OperatorRepository OperatorRepository;                                                                //dzieki lombokowi da rade bez @Autowired

    @PostMapping("/operators")
    Operator newOperator(@RequestBody Operator newOperator) {
        return OperatorRepository.save(newOperator);
    }

    @GetMapping("/operators")
    List<Operator> listOperators() {
        return OperatorRepository.findAll();
    }

    @DeleteMapping("/operators")
    ResponseEntity deleteOperators(@RequestBody Long idOperator) {
        OperatorRepository.deleteById(idOperator);
        return ResponseEntity.ok().build();
    }
}
