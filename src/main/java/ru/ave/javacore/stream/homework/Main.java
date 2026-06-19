package ru.ave.javacore.stream.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static void main() {

        Product product1 = new Product("молоко", "еда", BigDecimal.valueOf(100));
        Product product2 = new Product("яйца", "еда", BigDecimal.valueOf(90));
        Product product3 = new Product("игрушка", "детские товары", BigDecimal.valueOf(1000));
        Product product4 = new Product("мяч", "детские товары", BigDecimal.valueOf(1500));
        Product product5 = new Product("вода", "напитки", BigDecimal.valueOf(20));
        Product product6 = new Product("детское пюре", "детские товары", BigDecimal.valueOf(50));
        Product product7 = new Product("колбаса", "еда", BigDecimal.valueOf(700));
        Product product8 = new Product("детское мыло", "детские товары", BigDecimal.valueOf(150));
        Product product9 = new Product("водка", "алкоголь", BigDecimal.valueOf(900));

        Set<Product> products1 = Set.of(product1, product5, product9);
        Set<Product> products2 = Set.of(product4, product1, product2);
        Set<Product> products3 = Set.of(product9, product5, product4, product7);
        Set<Product> products4 = Set.of(product2, product3, product8);
        Set<Product> products5 = Set.of(product6, product2, product8, product4);
        Set<Product> products6 = Set.of(product1, product5, product4);
        Set<Product> products7 = Set.of(product8, product2, product9, product5, product4);
        Set<Product> products8 = Set.of(product4, product8, product3);
        Set<Product> products9 = Set.of(product7, product4, product1, product6);
        Set<Product> products10 = Set.of(product7, product4, product1, product6);
        Set<Product> products11 = Set.of(product1, product5, product9);
        Set<Product> products12 = Set.of(product4, product1, product2);
        Set<Product> products13 = Set.of(product9, product5, product4, product7);
        Set<Product> products14 = Set.of(product2, product3, product8);
        Set<Product> products15 = Set.of(product6, product2, product8, product4);
        Set<Product> products16 = Set.of(product1, product5, product4);
        Set<Product> products17 = Set.of(product8, product2, product9, product5, product4);
        Set<Product> products18 = Set.of(product4, product8, product3);
        Set<Product> products19 = Set.of(product7, product4, product1, product6);
        Set<Product> products20 = Set.of(product7, product4, product1, product6);
        Set<Product> products21 = Set.of(product1, product5, product9);
        Set<Product> products22 = Set.of(product4, product1, product2);
        Set<Product> products23 = Set.of(product9, product5, product4, product7);
        Set<Product> products24 = Set.of(product2, product3, product8);
        Set<Product> products25 = Set.of(product6, product2, product8, product4);

        Order order1 = new Order(LocalDate.of(2026, 6, 12), LocalDate.of(2026, 6, 14), "доставлен", products1);
        Order order2 = new Order(LocalDate.of(2026, 6, 7), LocalDate.of(2026, 6, 11), "доставлен", products2);
        Order order3 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 11), "в процесс", products3);
        Order order4 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 11), "доставлен", products4);
        Order order5 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 11), "в процесс", products5);
        Order order6 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 11), "доставлен", products6);
        Order order7 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 14), "в процесс", products7);
        Order order8 = new Order(LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 14), "доставлен", products8);
        Order order9 = new Order(LocalDate.of(2026, 2, 12), LocalDate.of(2026, 2, 14), "доставлен", products9);
        Order order10 = new Order(LocalDate.of(2026, 3, 18), LocalDate.of(2026, 3, 19), "в процесс", products10);
        Order order11 = new Order(LocalDate.of(2026, 3, 18), LocalDate.of(2026, 3, 19), "доставлен", products11);
        Order order12 = new Order(LocalDate.of(2026, 3, 18), LocalDate.of(2026, 3, 19), "в процесс", products12);
        Order order13 = new Order(LocalDate.of(2026, 4, 2), LocalDate.of(2026, 5, 11), "доставлен", products13);
        Order order14 = new Order(LocalDate.of(2026, 4, 2), LocalDate.of(2026, 5, 11), "в процесс", products14);
        Order order15 = new Order(LocalDate.of(2026, 4, 2), LocalDate.of(2026, 6, 11), "доставлен", products15);
        Order order16 = new Order(LocalDate.of(2026, 6, 2), LocalDate.of(2026, 6, 11), "доставлен", products16);
        Order order17 = new Order(LocalDate.of(2026, 6, 2), LocalDate.of(2026, 6, 11), "доставлен", products17);
        Order order18 = new Order(LocalDate.of(2026, 6, 6), LocalDate.of(2026, 6, 8), "в процесс", products18);
        Order order19 = new Order(LocalDate.of(2026, 6, 6), LocalDate.of(2026, 6, 8), "доставлен", products19);
        Order order20 = new Order(LocalDate.of(2026, 4, 6), LocalDate.of(2026, 4, 8), "доставлен", products20);
        Order order21 = new Order(LocalDate.of(2026, 4, 6), LocalDate.of(2026, 4, 8), "в процесс", products21);
        Order order22 = new Order(LocalDate.of(2026, 4, 6), LocalDate.of(2026, 4, 8), "доставлен", products22);
        Order order23 = new Order(LocalDate.of(2026, 5, 12), LocalDate.of(2026, 5, 14), "в процесс", products23);
        Order order24 = new Order(LocalDate.of(2026, 5, 12), LocalDate.of(2026, 5, 14), "доставлен", products24);
        Order order25 = new Order(LocalDate.of(2026, 5, 12), LocalDate.of(2026, 5, 14), "доставлен", products25);

        Set<Order> orders1 = Set.of(order1, order2, order3, order4, order5);
        Set<Order> orders2 = Set.of(order6, order7, order8, order9, order10);
        Set<Order> orders3 = Set.of(order11, order12, order13, order14, order15);
        Set<Order> orders4 = Set.of(order16, order17, order18, order19, order20);
        Set<Order> orders5 = Set.of(order21, order22, order23, order24, order25);

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Жека", orders1));
        customers.add(new Customer("Леха",2L, orders2));
        customers.add(new Customer("Юля", 3L, orders3));
        customers.add(new Customer("Саня", 2L,orders4));
        customers.add(new Customer("Толян", orders5));

        // Задание 15
        // Получите Map<String, Product> → самый дорогой продукт по каждой категории.








        // Задание 1

        List<Product> eatSmall100 = customers.stream()
                .flatMap(x -> x.getOrders().stream())
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .filter(p -> p.getCategory().equalsIgnoreCase("еда"))
                .filter(p -> p.getPrice().compareTo(BigDecimal.valueOf(100)) <= 0)
                .toList();

        //eatSmall100.stream().map(Product::getName).forEach(System.out::println);

        // Задание 2

        List<Order> ordersChildProduct = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equals("детские товары")))
                .distinct()
                .toList();

        //ordersChildProduct.forEach(System.out::println);

        // Задание 3

        BigDecimal sumAlco = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .flatMap(o -> o.getProducts().stream())
                .filter(p -> p.getCategory().equals("алкоголь"))
                .map(p -> p.getPrice().multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal::add).orElse(BigDecimal.valueOf(0));

        //System.out.println(sumAlco);

        // Задание 4

        List<Product> prosuctsL3 = customers.stream()
                .filter(c -> c.getLevel() == 3L)
                .flatMap(c -> c.getOrders().stream())
                .filter(o -> o.getOrderDate().isAfter(LocalDate.of(2026,4,1)) && o.getOrderDate().isBefore(LocalDate.of(2026,6,1)))
                .flatMap(o -> o.getProducts().stream()).toList();

        //prosuctsL3.forEach(System.out::println);

        // Задание 5

        List<Product> topMinPriceEat = customers.stream().flatMap(c -> c.getOrders().stream())
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .filter(p -> p.getCategory().equals("детские товары"))
                .sorted(Comparator.comparing(Product::getPrice))
                .limit(2).toList();

        // topMinPriceEat.forEach(System.out::println);

        // Задание 6

        List<Order> last3Orders = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .toList();

        // last3Orders.forEach(System.out::println);

        // Задание 7
        // Получите список заказов, сделанных "2026, апрель, 2", выведите id заказов в консоль и затем верните
        // список их продуктов.

        List<Product> products020426 = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .filter(o -> o.getOrderDate().equals(LocalDate.of(2026,4,2)))
        //        .peek(o -> System.out.println(o.getId()))
                .flatMap(o -> o.getProducts().stream())
                .toList();

        // products020426.forEach(System.out::println);

        // Задание 8
        // Рассчитайте общую сумму всех заказов, сделанных в феврале 2026.

        BigDecimal sumFeb26Order = customers.stream().flatMap(c -> c.getOrders().stream())
                .filter(o -> o.getOrderDate().isBefore(LocalDate.of(2026,5,1))
                        && o.getOrderDate().isAfter(LocalDate.of(2026,3,31)))
                .flatMap(o -> o.getProducts().stream())
                .map(Product::getPrice)
                .reduce(BigDecimal::add).orElse(BigDecimal.ZERO);

        // System.out.println(sumFeb26Order);

        // Задание 9
        // Рассчитайте средний платеж по заказам, сделанным 2-апреля-2026.

        List<Order> orders020426 = customers.stream().flatMap(c -> c.getOrders().stream())
                .filter(o -> o.getOrderDate().equals(LocalDate.of(2026,4,2)))
                .toList();
        BigDecimal avgOrders020426 = orders020426.stream().flatMap(o -> o.getProducts().stream())
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add).divide(BigDecimal.valueOf(orders020426.size()), RoundingMode.HALF_DOWN);

        //System.out.println(avgOrders020426);

        // Задание 10

        DoubleSummaryStatistics kidsProduct = customers.stream().flatMap(o -> o.getOrders().stream())
                .flatMap(p -> p.getProducts().stream())
                .filter(p -> p.getCategory().equals("детские товары"))
                .distinct()
                .mapToDouble(p -> p.getPrice().doubleValue())
                .summaryStatistics();

        // System.out.println(kidsProduct.getMax());
        // System.out.println(kidsProduct.getAverage());
        // System.out.println(kidsProduct.getCount());
        // System.out.println(kidsProduct.getMin());
        // System.out.println(kidsProduct.getSum());

        // Задание 11
        // Получите данные Map<Long, Integer> → key - id заказа, value - кол-во товаров в заказе

        Map<Long, Integer> countProductPerOrder = customers.stream().flatMap(c -> c.getOrders().stream())
                .collect(Collectors.toMap(Order::getId, o -> o.getProducts().size()));

        // Задание 12
        //Создайте Map<Customer, List<Order>> → key - покупатель, value - список его заказов

        Map<Customer, List<Order>> customerListMap = customers.stream()
                .collect(Collectors.toMap(c -> c, c -> new ArrayList<>(c.getOrders())));

        // Задание 13
        // Создайте Map<Order, Double> → key - заказ, value - общая сумма продуктов заказа.

        Map<Order, Double> priceByOrders = customers.stream().flatMap(c -> c.getOrders().stream())
                .collect(Collectors.toMap(o -> o
                        , o -> o.getProducts().stream()
                                .mapToDouble(p -> p.getPrice().doubleValue()).sum()));

        //System.out.println(priceByOrders);

        // Задание 14
        // Получите Map<String, List<String>> → key - категория, value - список названий товаров в категории

        Map<String, List<String>> productNamePerCategory = customers.stream().flatMap(c -> c.getOrders().stream())
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName, Collectors.toList())));

        // System.out.println(productNamePerCategory);


        // Задание 15
        // Получите Map<String, Product> → самый дорогой продукт по каждой категории.

        Map<String, Product> maxPriceProductPerCategory = customers.stream().flatMap(c -> c.getOrders().stream())
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.groupingBy(Product::getCategory
                        , Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice))
                                , opt -> opt.orElse(null))));



    }

}
