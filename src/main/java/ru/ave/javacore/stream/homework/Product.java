package ru.ave.javacore.stream.homework;

import java.math.BigDecimal;

public class Product {

    private static Long products = 0L;

    private final Long id;
    private final String name;
    private final String category;
    private final BigDecimal price;

    public Product(String name, String category, BigDecimal price) {
        this.name = name;
        this.category = category;
        this.price = price;
        id = ++products + 10000000;
    }

    public static Long getProducts() {
        return products;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
