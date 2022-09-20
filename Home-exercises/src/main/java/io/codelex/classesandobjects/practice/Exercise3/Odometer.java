package io.codelex.classesandobjects.practice.Exercise3;

public class Odometer {

    private int mileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void mileageUp() {
        int mile = this.getMileage() + 1;
        if (mile == 1000000) {
            mile = 0;
        }
        setMileage(mile);
    }
}
