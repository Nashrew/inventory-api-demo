package com.nash.andrew.inventoryapi.repository;

import com.nash.andrew.inventoryapi.model.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {
}
