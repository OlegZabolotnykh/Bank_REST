package com.example.bankcards.config;

import com.example.bankcards.service.CardService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class MyWebSecurityConfig {

    public MyWebSecurityConfig(CardService cardService) {
        this.cardService = cardService;
    }

    private final CardService cardService;


}
