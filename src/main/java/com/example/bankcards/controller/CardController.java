package com.example.bankcards.controller;

import com.example.bankcards.entity.CardEntity;
import com.example.bankcards.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/cards")
@AllArgsConstructor
public class CardController {

    private CardService cardService;

    @GetMapping
    public List<CardEntity> getAllCards() {
        return cardService.getAllCards();
    }

    @GetMapping("{id}")
    public CardEntity getCardById(@PathVariable Long id) {
        return cardService.getCardById(id);
    }
}
