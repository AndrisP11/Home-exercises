package io.codelex.classesandobjects.practice.Exercise6;

public class EnergyDrinks {
    final int NUMBERED_SURVEYED = 12467;
    final double PURCHASED_ENERGY_DRINKS = 0.14;
    final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        EnergyDrinks energy = new EnergyDrinks();
        double energyDrinkers = calculateEnergyDrinkers(energy.NUMBERED_SURVEYED, energy.PURCHASED_ENERGY_DRINKS);
        double preferCitrus = calculatePreferCitris(energyDrinkers, energy.PREFER_CITRUS_DRINKS);
        //fixme
        System.out.println("Total number of people surveyed " + energy.NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed, double purchasedEnergy) {
        return numberSurveyed * purchasedEnergy;
        //throw new NoCodeWrittenException();
    }

    public static double calculatePreferCitris(double energyDrinkers, double preferCitrus) {
        return energyDrinkers * preferCitrus;
        //     throw new NoCodeWrittenException();
    }

}
