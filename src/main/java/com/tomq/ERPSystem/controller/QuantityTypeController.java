package com.tomq.ERPSystem.controller;

import com.tomq.ERPSystem.entity.QuantityType;
import com.tomq.ERPSystem.repository.QuantityTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuantityTypeController {

    private final QuantityTypeRepository QuantityTypeRepository;                                                                //dzieki lombokowi da rade bez @Autowired

    @PostMapping("/QuantityTypes")
    public QuantityType newQuantityType(@RequestBody QuantityType newQuantityType) {
        return QuantityTypeRepository.save(newQuantityType);
    }

    @GetMapping("/QuantityTypes")
    public List<QuantityType> listQuantityTypes() {
        return QuantityTypeRepository.findAll();
    }

    @DeleteMapping("/QuantityTypes")
    public ResponseEntity deleteQuantityTypes(@RequestBody Long idQuantityType) {
        QuantityTypeRepository.deleteById(idQuantityType);
        return ResponseEntity.ok().build();
    }
}
