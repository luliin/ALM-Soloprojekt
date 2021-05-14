package com.example.springdocker.mathcalc;

/**
 * Created by Julia Wigenstedt
 * Date: 2021-05-14
 * Time: 09:04
 * Project: spring-docker-demo
 * Copyright: MIT
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if(b==0) {
            throw new ArithmeticException("Can't divide by zero");
        } else {
            return a / b;
        }
    }
}
