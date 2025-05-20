package com.example.bankcards.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public enum Role {
    USER, ADMIN;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
