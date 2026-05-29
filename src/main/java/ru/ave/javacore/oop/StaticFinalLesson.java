package ru.ave.javacore.oop;

public class StaticFinalLesson {

    public static void main(String[] args) {
        System.out.println(Employees.contract);
        Employees.addEmployee();
        Employees.addEmployee();
        Employees.addEmployee();
        System.out.println(Employees.count);
    }

}

class Employees {

    static int count;

    static final String contract = "Contract doc";

    static void addEmployee() {
        count++;
        System.out.println("now employees in company: " + count);
    }
}