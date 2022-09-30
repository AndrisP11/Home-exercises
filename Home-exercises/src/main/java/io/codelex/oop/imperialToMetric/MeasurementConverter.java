package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    double convert(int value, ConvertionType convertionType) {
        double result = 0;
        if (convertionType.equals(ConvertionType.METERS_TO_YARDS)) {
            result = value * 1.09361;
        }
        if (convertionType.equals(ConvertionType.YARDS_TO_METERS)) {
            result = value * 0.9144;
        }
        if (convertionType.equals(ConvertionType.CENTIMETERS_TO_ICHES)) {
            result = value / 2.54;
        }
        if (convertionType.equals(ConvertionType.INCHES_TO_CENTIMETERS)) {
            result = value * 2.54;
        }
        if (convertionType.equals(ConvertionType.KILOMETERS_TO_MILES)) {
            result = value / 1.609;
        }
        if (convertionType.equals(ConvertionType.MILES_TO_KILOMETERS)) {
            result = value * 1.609;
        }
        return result;
    }
}
