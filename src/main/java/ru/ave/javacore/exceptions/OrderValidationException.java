package ru.ave.javacore.exceptions;

public class OrderValidationException extends Exception {

    public OrderValidationException() {
        super();
    }

    public OrderValidationException(String message) {
        super(message);
    }

    public OrderValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
