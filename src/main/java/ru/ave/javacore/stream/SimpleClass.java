package ru.ave.javacore.stream;

import java.util.function.Function;
import java.util.function.Predicate;

public class SimpleClass {

    public static void main(String[] args) {
        SimpleInterface in = new SimpleInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        SimpleInterface in2 = Integer::sum;
        SimpleInterface in3 = (a,b) -> (a+b);

        Predicate<Integer> isZero = (x) -> x == 0;
        System.out.println(isZero.test(5));
        System.out.println(isZero.test(0));

        Function<Integer, String> intToString = (x) -> String.valueOf(x);
        Function<Integer, String> intToString2 = String::valueOf;




    }

    public static void print(int i) {
        System.out.println(i);
    }
}

@FunctionalInterface
interface SimpleInterface {
    int sum(int a, int b);

    default double duble(double y) {
        return 2*y;
    }

}
