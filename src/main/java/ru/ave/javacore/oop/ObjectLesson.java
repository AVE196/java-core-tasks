package ru.ave.javacore.oop;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class ObjectLesson {

    public static void main(String[] args) {

        Person p1 = new Person("alex", 11);
        Person p2 = new Person("alex", 11);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Person p3 = new Person(11);

        System.out.println(p1.equals(p3));

    }

}

class Person {

    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person (int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name != null ? "Person name: " + name + ", age: " + age : "Person name not init, age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person p = (Person) o;
        return age == p.age ? name != null && name.equals(p.name) : false;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        return 31 * result + age;
    }
}