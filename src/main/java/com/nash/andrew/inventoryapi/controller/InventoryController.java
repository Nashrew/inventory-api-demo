package com.nash.andrew.inventoryapi.controller;

import com.nash.andrew.inventoryapi.InventoryService;
import com.nash.andrew.inventoryapi.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/inventories")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{inventory-id}")
    public Inventory getInventory(@PathVariable("inventory-id") Long inventoryId) {
        return inventoryService.getInventory(inventoryId);
    }

    @PostMapping("/")
    public Inventory createInventory(@RequestBody Inventory inventory) {
        return inventoryService.createInventory(inventory);
    }

}
