package ru.ave.javacore.tesing;

import java.util.InputMismatchException;

public class DiscountCalculator {

    public double calculate(double price, double discount) {
        if (discount == 0d) return price;
        if (discount > 100 || discount < 0) throw new InputMismatchException(String.valueOf(discount));
        return price * (100 - discount) / 100;
    }
}
