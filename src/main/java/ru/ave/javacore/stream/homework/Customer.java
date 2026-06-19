package ru.ave.javacore.stream.homework;

import java.util.HashSet;
import java.util.Set;

public class Customer {

    private static Long customers = 0L;

    private static Long id;
    private final String name;
    private final Long level;
    private final Set<Order> orders;

    public Customer(String name, Long level, Set<Order> orders) {
        this.name = name;
        this.level = level;
        this.orders = orders;
        id = ++customers + 10000000;
    }

    public Customer(String name, Long level) {
        this.name = name;
        this.level = level;
        orders = new HashSet<>();
        id = ++customers + 10000000;
    }

    public Customer(String name, Set<Order> orders) {
        this.name = name;
        this.level = 0L;
        this.orders = orders;
        id = ++customers + 10000000;
    }

    public Customer(String name) {
        this.name = name;
        this.level = 0L;
        orders = new HashSet<>();
        id = ++customers + 10000000;
    }

    public static Long getCustomers() {
        return customers;
    }

    public static Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getLevel() {
        return level;
    }

    public Set<Order> getOrders() {
        return orders;
    }
}
