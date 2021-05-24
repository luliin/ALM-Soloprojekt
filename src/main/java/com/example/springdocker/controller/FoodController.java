package com.example.springdocker.controller;

import com.example.springdocker.model.Food;
import com.example.springdocker.service.FoodService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/foods")
@Slf4j
public class FoodController {
    private final FoodService service;

    @GetMapping
    public List<Food> getFoods() {
        log.info("food >> Get all food");
        return service.getFoods();
    }

    @PostMapping("/save")
    public void saveNewFood(@RequestBody Food food) {
        service.saveNewFood(food);
    }

    @GetMapping("/cookable")
    public List<String> getCookableFoods() {
        return service.getCookableFoods();
    }
}
