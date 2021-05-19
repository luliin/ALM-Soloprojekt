package com.example.springdocker.mathcalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Julia Wigenstedt
 * Date: 2021-05-20
 * Time: 00:06
 * Project: spring-docker-demo
 * Copyright: MIT
 */
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void additionTest1() {
        int expected = 8;
        int actual = calculator.add(6, 2);

        assertEquals(expected, actual);
    }

    @Test
    void additionTest2() {
        int expected = 100;
        int actual = calculator.add(105, -5);

        assertEquals(expected, actual);
    }

    @Test
    void additionTest3() {
        int notExpected = 100;
        int actual = calculator.add(105, 60);

        assertNotEquals(notExpected, actual);
    }

    @Test
    void multiplyTest1() {
        int expected = -12;
        int actual = calculator.multiply(6, -2);

        assertEquals(expected, actual);
    }

    @Test
    void multiplyTest2() {
        int expected = 100;
        int actual = calculator.multiply(5, 20);

        assertEquals(expected, actual);
    }

    @Test
    void multiplyTest3() {
        int notExpected = 100;
        int actual = calculator.multiply(105, 60);

        assertNotEquals(notExpected, actual);
    }


    @Test
    void divideTest1() {
        double expected = -12;
        double actual = calculator.divide(24, -2);

        assertEquals(expected, actual);
    }

    @Test
    void divideTest2() {
        double expected = 100;
        double actual = calculator.divide(400, 4);

        assertEquals(expected, actual);
    }

    @Test
    void divideTest3() {
        double notExpected = 100;
        double actual = calculator.divide(105, 60);

        assertNotEquals(notExpected, actual);
    }

    @Test
    void divideByZeroThrowsExceptionTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(60, 0));
    }





}