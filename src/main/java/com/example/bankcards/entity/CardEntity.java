package com.example.bankcards.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber;

    @ManyToOne
    private UserEntity owner;

    private YearMonth expiryDate;

    private CardStatus cardStatus;

    private Long balance;
}
