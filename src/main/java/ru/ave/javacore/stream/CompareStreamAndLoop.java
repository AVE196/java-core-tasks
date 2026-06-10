package ru.ave.javacore.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CompareStreamAndLoop {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(3,5,1,4,2);

        List<Integer> arrI = imperaticVariant(arr);
        System.out.println(arrI.toString());

        List<Integer> arrF = arr.stream().filter(x -> x > 2).collect(Collectors.toList());
        System.out.println(arrF.toString());

    }

    public static List<Integer> imperaticVariant(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (i > 2) result.add(i);
        }
        return result;
    }



}
