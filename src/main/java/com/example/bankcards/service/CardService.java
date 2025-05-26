package com.example.bankcards.service;

import com.example.bankcards.entity.CardEntity;

import java.util.List;

public interface CardService {
    List<CardEntity> getAllCards();

    CardEntity getCardById(Long id);
}
