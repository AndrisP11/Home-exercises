package io.codelex.oop.runners;

public class Test {

    public static void main(String[] args) {
        int time1 = 75;
        int time2 = 95;
        int time3 = 107;

        String fitnessLevel = Runner.getFitnessLevel(time1);
        String fitnessLevel2 = Runner.getFitnessLevel(time2);
        String fitnessLevel3 = Runner.getFitnessLevel(time3);

        System.out.println("Your fitness level is: " + fitnessLevel);
        System.out.println("Your fitness level is: " + fitnessLevel2);
        System.out.println("Your fitness level is: " + fitnessLevel3);
    }
}
