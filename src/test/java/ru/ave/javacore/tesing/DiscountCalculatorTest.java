package ru.ave.javacore.tesing;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {

    @Test
    void calcGood() {
        DiscountCalculator calculator = new DiscountCalculator();
        assertEquals(0, calculator.calculate(17, 100));
        assertEquals(40, calculator.calculate(50, 20));

    }

    @Test
    void calcBad() {
        DiscountCalculator calculator = new DiscountCalculator();
        assertThrows(InputMismatchException.class, () -> calculator.calculate(15, 120));
        assertThrows(InputMismatchException.class, () -> calculator.calculate(15, -20));
    }

}
