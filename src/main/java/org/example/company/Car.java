package org.example.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Car {
    private int wheels;
    private int cylinders;
    private boolean engine;
    private String name;

    public Car(int cylinders, String name){
        this.cylinders=cylinders;
        this.name=name;
        this.engine=true;
        this.wheels=4;
    }
    public int getCylinders(){
        return this.cylinders;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Clinders :" + this.cylinders + ", name : " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof Car))
            return false;

        Car carObj = (Car) obj;
        return this.name.equals(carObj.getName()) &&
                this.cylinders == carObj.getCylinders();
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

}

