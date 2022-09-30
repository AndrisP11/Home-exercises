package io.codelex.oop.imperialToMetric;

public class Test {
    public static void main(String[] args) {

        MeasurementConverter measure = new MeasurementConverter();

        double yard = measure.convert(12, ConvertionType.METERS_TO_YARDS);
        System.out.println(String.format("%.2f", yard) + " yards");

        double meters = measure.convert(6, ConvertionType.YARDS_TO_METERS);
        System.out.println(String.format("%.2f", meters) + " meters");

        double inches = measure.convert(7, ConvertionType.CENTIMETERS_TO_ICHES);
        System.out.println(String.format("%.2f", inches) + " inches");

        double centimeters = measure.convert(9, ConvertionType.INCHES_TO_CENTIMETERS);
        System.out.println(String.format("%.2f", centimeters) + " centimeters");

        double miles = measure.convert(3, ConvertionType.KILOMETERS_TO_MILES);
        System.out.println(String.format("%.2f", miles) + " miles");

        double kilometers = measure.convert(5, ConvertionType.MILES_TO_KILOMETERS);
        System.out.println(String.format("%.2f", kilometers) + " kilometers");
    }
}
