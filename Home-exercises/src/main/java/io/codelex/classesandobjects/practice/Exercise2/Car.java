package io.codelex.classesandobjects.practice.Exercise2;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;


    private boolean hasFillUp = false;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
        this.endKilometers = this.startKilometers;
        this.liters = 0;
    }

    public double calculateConsumption() {
        return liters / ((endKilometers - startKilometers) / 100);
    }

    public boolean isGasHog() {
        final double gasHogLowerLimit = 15.0;
        return this.calculateConsumption() > gasHogLowerLimit;
    }

    public boolean isEconomyCar() {
        final double ecoCarUpperLimit = 5.0;
        return this.calculateConsumption() < ecoCarUpperLimit;
    }

    public void fillUp(double mileage, double liters) {
        if (hasFillUp) {
            this.startKilometers = this.endKilometers;
        }
        this.endKilometers = mileage;
        this.liters = liters;
        hasFillUp = true;
    }

}
