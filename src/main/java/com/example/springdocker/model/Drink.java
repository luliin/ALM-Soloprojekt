package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Julia Wigenstedt
 * Date: 2021-05-14
 * Time: 01:21
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drink {
    private String id;
    private String name;
    private boolean isDelicious;
    private boolean needsPreparation;
}
