package ru.ave.javacore.oop;

public class AbstractClassAndPolymorphLesson {
    public static void main(String[] args) {
        Car myCar = new Car("Electric car");
        myCar.start();
        myCar.stop();
        myCar.getInfo();
    }
}

abstract class Vehicle {
    String type;
    abstract void getInfo();
}

interface Runnable {
    void start();
    void stop();
}

class Car extends Vehicle implements Runnable {

    Car (String type) {
        super.type = type;
    }

    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine");
    }

    @Override
    void getInfo() {
        System.out.printf("It's %s\n", type);
    }
}
