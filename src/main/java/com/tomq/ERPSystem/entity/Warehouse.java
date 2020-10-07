package com.tomq.ERPSystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idWarehouse;

    @Column
    private String name;

    @ManyToMany(mappedBy = "warehouses")
    private Set<Item> items;
}
