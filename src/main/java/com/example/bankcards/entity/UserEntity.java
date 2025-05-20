package com.example.bankcards.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String name;

    private String lastname;

    @OneToMany(mappedBy = "owner",
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<CardEntity> cards;

    @Enumerated
    private Role role;
}
