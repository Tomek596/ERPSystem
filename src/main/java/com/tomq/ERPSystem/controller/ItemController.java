package com.tomq.ERPSystem.controller;

import com.tomq.ERPSystem.entity.Item;
import com.tomq.ERPSystem.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;                                                                //dzieki lombokowi da rade bez @Autowired

    @PostMapping("/items")
    public Item newItem(@RequestBody Item newItem) {
        return itemRepository.save(newItem);
    }

    @GetMapping("/items")
    public List<Item> listItems() {
        return itemRepository.findAll();
    }

    @DeleteMapping("/items")
    public ResponseEntity deleteItems(@RequestBody Long idItem) {
        itemRepository.deleteById(idItem);
        return ResponseEntity.ok().build();
    }
}
