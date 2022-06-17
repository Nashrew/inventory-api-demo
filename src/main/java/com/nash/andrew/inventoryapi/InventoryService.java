package com.nash.andrew.inventoryapi;

import com.nash.andrew.inventoryapi.model.Inventory;
import com.nash.andrew.inventoryapi.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory getInventory(Long inventoryId) {
        Inventory inventory = inventoryRepository.findById(inventoryId).orElse(null);
        return inventory;
    }

    public Inventory createInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }
}
