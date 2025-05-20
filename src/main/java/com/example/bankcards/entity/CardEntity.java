package com.example.bankcards.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Entity
@Table(name = "cards")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity owner;

    private YearMonth expiryDate;

    @Enumerated
    private CardStatus cardStatus;

    private Long balance;
}
