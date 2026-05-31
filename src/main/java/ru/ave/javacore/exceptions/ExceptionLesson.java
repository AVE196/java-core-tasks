package ru.ave.javacore.exceptions;

import java.util.Arrays;

public class ExceptionLesson {

    public static void main(String[] args) {

        SimpleClass sc = new SimpleClass();

        sc.someMethod();

    }
}

class SimpleClass {

    void someMethod() {
        String s = null;
        try {
            s.length();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

}
