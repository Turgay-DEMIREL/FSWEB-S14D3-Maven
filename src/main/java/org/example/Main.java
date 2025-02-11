package org.example;

import org.example.company.Car;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());
    }
}