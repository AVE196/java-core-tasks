package ru.ave.javacore.exceptions;

public class InventoryService {

    public void checkAvailability(String productId) {

        if (productId.equals(" ")) {
            throw new IllegalArgumentException("Некорректный ввод productId: " + productId);
        }

    }

}
