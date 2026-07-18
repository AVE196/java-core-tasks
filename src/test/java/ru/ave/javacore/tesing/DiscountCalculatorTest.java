package ru.ave.javacore.tesing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {

    DiscountCalculator calculator;

    @BeforeEach
    void startUp() {
        calculator = new DiscountCalculator();
    }

    @Test
    void calcGood() {
        assertEquals(40, calculator.calculate(50, 20));

    }

    @Test
    void calcBad() {
        assertThrows(InputMismatchException.class, () -> calculator.calculate(15, 120));
        assertThrows(InputMismatchException.class, () -> calculator.calculate(15, -20));
    }

    @Test
    void calcBorderValue() {
        assertEquals(0, calculator.calculate(17, 100));
        assertEquals(200, calculator.calculate(200, 0));
    }




}
