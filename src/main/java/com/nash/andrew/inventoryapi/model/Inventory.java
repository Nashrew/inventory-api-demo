package com.nash.andrew.inventoryapi.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Inventory {
    private Long id;
    private String content; // in the real world this is probably something other than a string, just keeping it simple here
    private String experienceDetails;
}
