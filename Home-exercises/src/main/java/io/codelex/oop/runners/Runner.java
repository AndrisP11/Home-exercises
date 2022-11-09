package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(100, 120),
    INTERMEDIATE(80, 99),
    ADVANCED(0, 79);

    private int min;
    private int max;

    Runner(int min, int max) {
        this.min = min;
        this.max = max;

    }

    static String getFitnessLevel(int time) {
        if (ADVANCED.min < time && time < ADVANCED.max) {
            return ADVANCED.name();
        } else if (INTERMEDIATE.min < time && time < INTERMEDIATE.max) {
            return INTERMEDIATE.name();
        } else if (BEGINNER.min < time && time < BEGINNER.max) {
            return BEGINNER.name();
        } else {
            return "Invalid time";
        }
    }
}
