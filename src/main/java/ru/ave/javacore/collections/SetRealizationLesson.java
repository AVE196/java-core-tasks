package ru.ave.javacore.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRealizationLesson {

    public static void main(String[] args) {
        Set<String> lset = new LinkedHashSet<>();
        Set<String> hset = new HashSet<>();
        Set<String> tset = new TreeSet<>();
        fillSet(lset);
        fillSet(hset);
        fillSet(tset);

        lset.forEach(System.out::println);
        System.out.println();
        hset.forEach(System.out::println);
        System.out.println();
        tset.forEach(System.out::println);
    }

    static void fillSet(Set<String> set) {
        set.add("whisper");
        set.add("mountain");
        set.add("curious");
        set.add("ocean");
        set.add("gentle");
        set.add("festival");
        set.add("shadow");
        set.add("journey");
        set.add("harmony");
        set.add("puzzle");
        set.add("breeze");
        set.add("ancient");
        set.add("laughter");
        set.add("melody");
        set.add("courage");
        set.add("whirl");
        set.add("dawn");
        set.add("treasure");
        set.add("serene");
        set.add("echo");
    }

}
