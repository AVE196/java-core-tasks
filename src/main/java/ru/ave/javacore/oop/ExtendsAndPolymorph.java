package ru.ave.javacore.oop;

public class ExtendsAndPolymorph {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.getName();
        dog.makeSound();
        Animal an = dog;
        an.makeSound();

        if (!(an instanceof Cat)) System.out.println("not do it");
        else {
            Cat cat = (Cat) an;
        }

    }
}

class Animal {

    private String name = "my name";

    void getName() {
        System.out.println(name);
    }

    public void makeSound() {
        System.out.println("sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("gaf");
    }

}

class Cat extends Animal {

}