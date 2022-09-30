package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        boolean isValid = false;
        if (xLength + yLength + zLength > 300) {
            System.out.println("Invalid parcel! Your parcels the sum of the dimensions exceeds 300.");
            isValid = false;
        } else if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Invalid parcel! Your parcels length, width or height can't exceed 30.");
            isValid = false;
        } else if (weight > 15 && isExpress == true) {
            System.out.println("Invalid parcel! Your parcels weight exceed 15 therefore it isn't valid for express delivery.");
            isValid = false;
        } else if (weight > 30 && isExpress == false) {
            System.out.println("Invalid parcel! Your parcels weight exceed 30.");
        } else {
            System.out.println("Parcel is valid for delivery.");
            isValid = true;
        }
        return isValid;
    }
}
