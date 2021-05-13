package com.example.springdocker.controller;

import com.example.springdocker.model.Food;
import com.example.springdocker.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/foods")
public class FoodController {
    private final FoodService service;

    @GetMapping
    public List<Food> getFoods() {
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
