package ru.ave.javacore.stream;

import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
/*
        Function<Integer, String> intToString = (x) -> String.valueOf(x);
        Function<Integer, String> intToString2 = String::valueOf;

        Stream.generate(Math::random).limit(10).mapToInt(x -> (int) (x * 100)).forEach(System.out::println);
        Stream.iterate(5, i -> i * 100).limit(10).forEach(System.out::println);
*/

        Stream<String> stream = Stream.of("Hello", "WORLD", "al@e", "pupupupu");
        List<String> collect = stream.filter(x -> x.length() <= 5)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

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
