package com.example.bankcards.service;

import com.example.bankcards.entity.CardEntity;
import com.example.bankcards.repository.CardRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public List<CardEntity> getAllCards() {
//        return List.of(new CardEntity(44L, "5555", null, null, CardStatus.ACTIVE, 777l));
        return cardRepository.findAll();
    }

    @Override
    public CardEntity getCardById(Long id) {
        return cardRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("%s not found".formatted(id))
        );
    }
}
