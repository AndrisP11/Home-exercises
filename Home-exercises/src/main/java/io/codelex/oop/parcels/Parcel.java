package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public void validate() {
        if (xLength + yLength + zLength > 300) {
            System.out.println("Invalid parcel! Your parcels the sum of the dimensions exceeds 300.");
        } else if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Invalid parcel! Your parcels length, width or height can't exceed 30.");
        } else if (weight > 15 && isExpress) {
            System.out.println("Invalid parcel! Your parcels weight exceed 15 therefore it isn't valid for express delivery.");
        } else if (weight > 30 && !isExpress) {
            System.out.println("Invalid parcel! Your parcels weight exceed 30.");
        } else {
            System.out.println("Parcel is valid for delivery.");
        }
    }
}
