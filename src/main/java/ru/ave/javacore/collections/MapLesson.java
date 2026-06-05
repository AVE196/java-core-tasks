package ru.ave.javacore.collections;

import java.util.HashMap;
import java.util.Map;

public class MapLesson {

    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        stock.put("Apple", 10);
        stock.put("Banana", 7);
        stock.put("Onion", 150);
        stock.put("Orange", 23);
        stock.put("Milk", 100);

        showStorage(stock);
        System.out.println();
        System.out.println();

        addProduct(stock,"Apple", 30);
        addProduct(stock,"Plum", 300);

        showStorage(stock);
        System.out.println();
        System.out.println();

        sellProduct(stock, "Onion", 30);
        sellProduct(stock, "Banana", 10);
        sellProduct(stock, "On", 3000);

        showStorage(stock);

    }

    public static void addProduct(Map<String, Integer> map, String name, Integer count) {
        if (map.containsKey(name)) {
            map.put(name, map.get(name) + count);
        } else map.put(name, count);

    }

    public static void sellProduct(Map<String, Integer> map, String name, Integer count) {
        if (!map.containsKey(name)) System.out.println("Нет такого товара");
        else if (map.get(name) - count < 0) {
            System.out.println("Недостаточно товара");
        } else {
            map.put(name, map.get(name) - count);
        }
    }

    public static void showStorage (Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
