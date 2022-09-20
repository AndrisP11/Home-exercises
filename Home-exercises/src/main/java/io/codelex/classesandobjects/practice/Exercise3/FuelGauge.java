package io.codelex.classesandobjects.practice.Exercise3;

public class FuelGauge {
    private int fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public void fuelUp(int i) {
        for (int j = 0; j < i; j++) {
            this.fuel++;
        }
    }

    public void fuelDown() {
        this.fuel--;
    }

    public int getFuel() {
        return fuel;
    }

}
