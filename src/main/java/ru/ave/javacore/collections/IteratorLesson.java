package ru.ave.javacore.collections;

import java.util.*;

public class IteratorLesson {

    public static void main(String[] args) {

        String s1 = "read book";
        String s2 = "send email";
        String s3 = "done: clean room";
        String s4 = "done: buy food";
        String s5 = "write code";

        List<String> strings = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()) {
            if (iterator.next().startsWith("done:")) iterator.remove();
        }

        strings.forEach(System.out::println);

    }

}
