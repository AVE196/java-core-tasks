package ru.ave.javacore.exceptions;

public class OrderService {

    private final InventoryService inventoryService = new InventoryService();

    public void placeOrder(String productId, int quantity) throws OrderValidationException {

        if (productId == null || productId.isEmpty()) {
            throw new OrderValidationException("product ID не может быть пустым либо null: " + productId);
        } else if (quantity <= 0) {
            throw new OrderValidationException("Количество не может быть меньше либо равно 0:" + quantity);
        }
        try {
            inventoryService.checkAvailability(productId);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument: " + e.getMessage());
            throw new OrderValidationException(e.getMessage(), e);
        }
    }

}
