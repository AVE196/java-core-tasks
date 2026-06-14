package ru.ave.javacore.stream;

import java.util.Arrays;
import java.util.List;

public class PerformingStream {

    static void main() {
        List<Integer> numbers = Arrays.asList(new Integer[100000]);
        // Инициализация списка для демонстрации
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, i);
        }

        // Замер времени работы обычного цикла for
        long startFor = System.nanoTime();
        int sumFor = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                sumFor += n;
            }
        }
        long endFor = System.nanoTime();
        System.out.println("Цикл for, сумма чётных: " + sumFor + " за " + (endFor - startFor) + " нс");

        // Замер времени работы стрима
        long startStream = System.nanoTime();
        int sumStream = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        long endStream = System.nanoTime();
        System.out.println("Стрим, сумма чётных: " + sumStream + " за " + (endStream - startStream) + " нс");
    }
}
