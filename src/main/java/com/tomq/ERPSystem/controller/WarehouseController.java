package com.tomq.ERPSystem.controller;

import com.tomq.ERPSystem.entity.Warehouse;
import com.tomq.ERPSystem.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WarehouseController {

    private final WarehouseRepository WarehouseRepository;                                                                //dzieki lombokowi da rade bez @Autowired

    @PostMapping("/warehouses")
    Warehouse newWarehouse(@RequestBody Warehouse newWarehouse) {
        return WarehouseRepository.save(newWarehouse);
    }

    @GetMapping("/warehouses")
    List<Warehouse> listWarehouses() {
        return WarehouseRepository.findAll();
    }

    @DeleteMapping("/warehouses")
    ResponseEntity deleteWarehouses(@RequestBody Long idWarehouse) {
        WarehouseRepository.deleteById(idWarehouse);
        return ResponseEntity.ok().build();
    }
}
