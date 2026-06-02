package ru.ave.javacore.exceptions;

public class MainExceptionClass {

    public static void main(String[] args) {

        try {
            OrderService orderService = new OrderService();
            orderService.placeOrder(" ", 10);
        } catch (OrderValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            OrderService orderService = new OrderService();
            orderService.placeOrder("aaa", -1);
        } catch (OrderValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            OrderService orderService = new OrderService();
            orderService.placeOrder(null, 3);
        } catch (OrderValidationException e) {
            System.out.println(e.getMessage());
        }

    }

}
