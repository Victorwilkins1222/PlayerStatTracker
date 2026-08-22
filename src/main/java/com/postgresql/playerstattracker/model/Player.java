package com.postgresql.playerstattracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int jerseyNumber;
    private String name;
    private String position;
    private String height;
    private Double pointsPG;
    private Double assistPG;
    private Double reboundsPG;
    private Double stealsPG;
    private Double turnoverPG;
}
