package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    double convert(int value, ConvertionType convertionType) {
        if (convertionType.equals(ConvertionType.METERS_TO_YARDS)) {
            return value * 1.09361;
        } else if (convertionType.equals(ConvertionType.YARDS_TO_METERS)) {
            return value * 0.9144;
        } else if (convertionType.equals(ConvertionType.CENTIMETERS_TO_ICHES)) {
            return value / 2.54;
        } else if (convertionType.equals(ConvertionType.INCHES_TO_CENTIMETERS)) {
            return value * 2.54;
        } else if (convertionType.equals(ConvertionType.KILOMETERS_TO_MILES)) {
            return value / 1.609;
        } else if (convertionType.equals(ConvertionType.MILES_TO_KILOMETERS)) {
            return value * 1.609;
        } else {
            return 0;
        }

    }
}
