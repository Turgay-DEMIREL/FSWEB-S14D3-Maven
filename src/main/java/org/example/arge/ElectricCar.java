package org.example.arge;

public class ElectricCar extends CarSkeleton{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description
            ,double avgKmPerCharge, int batterySize){
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public int getBatterySize() {
        return this.batterySize;
    }

    public double getAvgKmPerCharge() {
        return this.avgKmPerCharge;
    }

    @Override
    public String drive() {
        System.out.println(getClass().getSimpleName());
        return runEngine();
    }

    @Override
    protected String runEngine() {
        return "ElectricCar engine is running";
    }
}
