package ru.ave.javacore.exceptions;

public class ExampleException extends Exception{

    public ExampleException() {
        super();
    }

    public ExampleException(String message) {
        super(message);
    }

    public ExampleException(String message, Throwable cause) {
        super(message, cause);
    }
}
