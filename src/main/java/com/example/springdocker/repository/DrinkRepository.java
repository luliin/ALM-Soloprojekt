package com.example.springdocker.repository;

import com.example.springdocker.model.Drink;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Julia Wigenstedt
 * Date: 2021-05-14
 * Time: 01:23
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@Repository
public interface DrinkRepository extends MongoRepository<Drink, String> {
    List<Drink> findByDelicious(boolean isDelicious);
}
