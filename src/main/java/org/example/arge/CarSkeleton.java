package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;
    private String runEngine;

    public CarSkeleton(){}

    public CarSkeleton(String name, String description){
        this.name = name;
        this.description=description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the cars engine starting";
    }

    public String drive(){
        return this.runEngine;
    }

    protected String runEngine(){
        System.out.println(getClass().getSimpleName());
    return "the engine is running";
    }

}
