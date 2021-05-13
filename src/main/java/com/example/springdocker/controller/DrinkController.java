package com.example.springdocker.controller;

import com.example.springdocker.model.Drink;
import com.example.springdocker.service.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Julia Wigenstedt
 * Date: 2021-05-14
 * Time: 01:27
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/drinks")
public class DrinkController {

    private final DrinkService drinkService;

    @GetMapping
    public List<Drink> getFoods() {
        return drinkService.getDrinks();
    }

    @PostMapping("/add")
    public void saveNewFood(@RequestBody Drink drink) {
        drinkService.saveNewDrink(drink);
    }

    @GetMapping("/delicious")
    public List<String> getDeliciousDrinks() {
        return drinkService.getNamesOfDeliciousDrinks();
    }
}
