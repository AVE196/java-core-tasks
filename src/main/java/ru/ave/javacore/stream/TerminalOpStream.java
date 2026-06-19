package ru.ave.javacore.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TerminalOpStream {

    public static void main(String[] args) {

        List<Integer> sum = List.of(150, 970, 316, 10, 1465, 73, 31000, 41, 75, 7897);

        List<Integer> filteredList = sum.stream().filter(x -> x < 1000).toList();
        long countFiltered = sum.stream().filter(x -> x < 1000).count();
/*
        System.out.println(filteredList);
        System.out.println(countFiltered);

        sum.stream().filter(x -> x < 1000).forEach(System.out::println);

 */
        Map<Integer, List<Integer>> collect = sum.stream().filter(x -> x < 1000).collect(Collectors.groupingBy(x -> x % 3));

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, List<Integer>> entry : collect.entrySet()) {
            sb.append(entry.getKey()).append(" - ").append(entry.getValue()).append("\n");
        }

        System.out.println(sb);


    }

}
