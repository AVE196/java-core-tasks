package ru.ave.javacore.oop;

public class Casting {

    public static void main(String[] args) {

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        int i = 150;
        byte b = (byte) i;
        System.out.println(b);

        System.out.println(Double.MAX_VALUE);
        int i1 = (int) Double.MAX_VALUE;
        System.out.println(i1);

        System.out.println(Float.MAX_VALUE);
        int i2 = (int) Float.MAX_VALUE;
        System.out.println(i2);
    }

}
