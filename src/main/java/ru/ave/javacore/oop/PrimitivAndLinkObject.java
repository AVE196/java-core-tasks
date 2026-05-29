package ru.ave.javacore.oop;

public class PrimitivAndLinkObject {

    public static void main(String[] args) {

        Integer i = (Integer) 2000;
        simpleMethod(i);
        System.out.println(i);


    }

    static void simpleMethod(Integer i) {
        i = (Integer) 500;
    }

}
