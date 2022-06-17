package com.nash.andrew.inventoryapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content; // in the real world this is probably something other than a string, just keeping it simple here

    @Column(name = "experience_details", nullable = false)
    private String experienceDetails;
}
