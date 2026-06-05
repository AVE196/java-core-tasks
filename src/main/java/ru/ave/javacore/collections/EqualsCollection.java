package ru.ave.javacore.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualsCollection {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("user1");
        list1.add("user2");
        list1.add("user3");
        list1.add("user4");

        list2.add("user2");
        list2.add("user1");
        list2.add("user3");
        list2.add("user7");

        System.out.println(list1.equals(list2));

        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        System.out.println(set1.equals(set2));


        Set<String> eqSet = new HashSet<>();

        for (String string : set1) {
            if (set2.contains(string)) eqSet.add(string);
        }
        eqSet.forEach(System.out::println);
        System.out.println();
        Set<String> notEqSet = new HashSet<>();


        set1.removeAll(eqSet);
        set2.removeAll(eqSet);

        notEqSet.addAll(set1);
        notEqSet.addAll(set2);
        notEqSet.forEach(System.out::println);
    }
}
