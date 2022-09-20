package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Data");
        System.out.print("Please input your distance in meters: ");
        double distance = in.nextInt();
        System.out.print("Please input your time hours: ");
        int hours = in.nextInt();
        System.out.print("Please input your time minutes: ");
        int minutes = in.nextInt();
        System.out.print("Please input your time seconds: ");
        int seconds = in.nextInt();
        double allTimeSeconds = (((hours * 60) + minutes) * 60) + seconds;
        double speedMetersSecond = distance / allTimeSeconds;
        double speedKmHours = speedMetersSecond * 3.6;
        double speedMilesHour = speedKmHours / 1.609;
        in.close();

        System.out.println("Output :");
        System.out.println("Your speed in meters/second is " + String.format("%.8f", speedMetersSecond));
        System.out.println("Your speed in km/h is " + String.format("%.8f", speedKmHours));
        System.out.println("Your speed in miles/h is " + String.format("%.8f", speedMilesHour));

    }
}
