package io.codelex.oop.parcels;

public class Test {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(50, 50, 50, 25, false);
        parcel1.validate();
        Parcel parcel2 = new Parcel(29, 50, 50, 25, false);
        Parcel parcel3 = new Parcel(50, 150, 150, 25, false);
        Parcel parcel4 = new Parcel(50, 50, 50, 10, false);
        Parcel parcel5 = new Parcel(50, 50, 50, 35, false);
        Parcel parcel6 = new Parcel(50, 50, 50, 16, true);
        parcel2.validate();
        parcel3.validate();
        parcel4.validate();
        parcel5.validate();
        parcel6.validate();
    }
}
