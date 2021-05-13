package com.example.springdocker.service;

import com.example.springdocker.model.Drink;
import com.example.springdocker.model.Food;
import com.example.springdocker.repository.DrinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Julia Wigenstedt
 * Date: 2021-05-14
 * Time: 01:24
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@RequiredArgsConstructor
@Service
public class DrinkService {
    private final DrinkRepository drinkRepository;

    public List<Drink> getDrinks() {
        return drinkRepository.findAll();
    }
    public void saveNewDrink(Drink drink) {
        drinkRepository.save(drink);
    }

    public List<String> getNamesOfDeliciousDrinks() {
       
        List<Drink> deliciousDrinks = drinkRepository.findByDelicious(true);
        
        return deliciousDrinks.stream()
                .map(Drink::getName)
                .collect(Collectors.toList());
    }
}
