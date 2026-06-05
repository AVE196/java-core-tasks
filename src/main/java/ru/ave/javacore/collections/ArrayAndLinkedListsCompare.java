package ru.ave.javacore.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedListsCompare {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("инициализация " + i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add( "Новая строка в конец " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ARR добавление в конец: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(5, "Новая строка в середину " + i);
        }
        end = System.currentTimeMillis();
        System.out.println("ARR добавление в середину: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String j = list.get(10000);
        }
            end = System.currentTimeMillis();
        System.out.println("ARR обращение к индексу: " + (end - start));




        list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add("инициализация " + i);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add( "Новая строка в конец " + i);
        }
        end = System.currentTimeMillis();
        System.out.println("LL добавление в конец: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(5, "Новая строка в середину " + i);
        }
        end = System.currentTimeMillis();
        System.out.println("LL добавление в середину: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String j = list.get(10000);
        }
        end = System.currentTimeMillis();
        System.out.println("LL обращение к индексу: " + (end - start));

    }

}
