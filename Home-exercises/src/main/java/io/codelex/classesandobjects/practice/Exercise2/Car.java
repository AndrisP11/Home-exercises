package io.codelex.classesandobjects.practice.Exercise2;

public class Car {
    double startKilometers;
    double endKilometers;
    double liters;

    boolean hasFillUp = false;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
        this.endKilometers = this.startKilometers;
        this.liters = 0;
    }

    public double calculateConsumption() {
        return liters / ((endKilometers - startKilometers) / 100);
    }

    public boolean isGasHog() {
        return this.calculateConsumption() > 15.0;
    }

    public boolean isEconomyCar() {
        return this.calculateConsumption() < 5.0;
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
