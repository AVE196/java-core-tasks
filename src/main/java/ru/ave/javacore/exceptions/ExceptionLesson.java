package ru.ave.javacore.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLesson {

    public static void main(String[] args) {

        SimpleClass sc = new SimpleClass();
        //sc.someMethod();
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                sc.runExample(scan.nextInt());
            } catch (ArithmeticException e) {
                System.out.println("деление на 0");
                System.out.println(e.getClass().getSimpleName());
            } catch (RuntimeException e) {
                System.out.println("runtime");
                System.out.println(e.getClass().getSimpleName());
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("общее");
                System.out.println(e.getClass().getSimpleName());
                System.out.println(e.getMessage());
            } finally {
                System.out.println("блок finally выполнен");
            }
        }

    }
}

class SimpleClass {

    Logger logger = Logger.getLogger(SimpleClass.class.getName());

    void someMethod() {
        String s = null;
        try {
            s.length();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println(e.getClass().getSimpleName());
        }
    }

    void runExample (int i) throws IOException, ExampleException {
        switch (i) {
            case 1:
                int b = i / 0;
                break;
            case 2:
                int[] arr = {0, 2};
                logger.log(Level.WARNING, "test logger");
                System.out.println(arr[2]);
                break;
            case 3:
                throw new RuntimeException("err");
            case 4:
                BufferedReader br = new BufferedReader(new FileReader("123"));
                System.out.println(br.readLine());
                br = new BufferedReader(new FileReader("1234"));
            case 5:
                throw new ExampleException("my exception");
            case 6:
                throw new ExampleRuntimeException("my runtime exception");
        }
    }


}
