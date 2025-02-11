package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description
            ,double avgKmPerLitre, int cylinders){
        super(name, description);
        this.avgKmPerLiter = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "GasPowerCars engine is starting";
    }

    public double getAverageKmPerLiter() {
        return this.avgKmPerLiter;
    }
}
