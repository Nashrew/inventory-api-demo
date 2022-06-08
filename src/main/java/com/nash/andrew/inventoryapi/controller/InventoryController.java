package com.nash.andrew.inventoryapi.controller;

import com.nash.andrew.inventoryapi.model.Inventory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/inventories")
public class InventoryController {

    // extremely basic hard-coded inventory endpoint, just so there is something that *can* be run alongside product-api-demo if desired
    @GetMapping("/{inventory-id}")
    public Inventory getInventory(@PathVariable("inventory-id") Long inventoryId) {
        if(inventoryId == 1) {
            return Inventory.builder()
                    .id(1L)
                    .content("One admission to space mountain")
                    .experienceDetails("Fun roller coaster in the dark!")
                    .build();
        }
        else if(inventoryId == 2L) {
            return Inventory.builder()
                    .id(2L)
                    .content("One Admission to the Lunar Rovers")
                    .experienceDetails("We're whalers on the moon")
                    .build();
        }
        else {
            throw new RuntimeException("Inventory not found :(");
        }
    }

}
