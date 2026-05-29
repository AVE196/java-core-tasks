package ru.ave.javacore.oop;

public class ClassLesson {

    public static void main(String[] args) {

        SimpleClass milk = new SimpleClass(5, "Milk");
        milk.getInfo();

        SimpleClass noName = new SimpleClass();
        noName.getInfo();

    }

}

class SimpleClass {

    int count;

    String product;

    SimpleClass (int count, String product) {
        this.count = count;
        this.product = product;
    }

    SimpleClass() {

    }

    void getInfo() {
        System.out.printf("Product name: %s; count: %d\n", product, count);
    }

}
