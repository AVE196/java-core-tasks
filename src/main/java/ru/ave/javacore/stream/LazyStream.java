package ru.ave.javacore.stream;

import java.util.Arrays;
import java.util.List;

public class LazyStream {

    static void main() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
                .peek(n -> System.out.println("Начальное значение: " + n)) // для отладки: выводим начальные значения
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("После filter: " + n))
                .map(n -> n * n)
                .peek(n -> System.out.println("После map: " + n))
                .toList();

        System.out.println("Результат: " + result);

    }

}
