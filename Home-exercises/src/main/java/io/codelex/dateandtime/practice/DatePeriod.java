package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate firstStart, LocalDate firstEnd) {
        this.start = firstStart;
        this.end = firstEnd;
    }

    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        System.out.print("Overlap variable should have start date " + overlap.start);
        System.out.print(" and end date " + overlap.end);

    }

    public DatePeriod intersection(DatePeriod second) {
        boolean validA = (!this.start.isAfter(second.end));
        boolean validB = (!second.start.isAfter(this.end));
        DatePeriod inter;
        LocalDate interStart = null;
        LocalDate interEnd = null;

        if (validA && validB) {

            int daysToInter = this.start.compareTo(second.start);
            int daysToEnd = this.end.compareTo(second.end);
            int firstStartSecondEnd = this.start.compareTo(second.end);
            int firstEndSecondStart = this.end.compareTo(second.start);

            if (daysToInter > 0 && firstStartSecondEnd < 0 && daysToEnd < 0 && firstEndSecondStart > 0) {
                interStart = this.start;
                interEnd = this.end;
            }
            if (daysToInter < 0 && firstStartSecondEnd < 0 && daysToEnd < 0 && firstEndSecondStart > 0) {
                interStart = second.start;
                interEnd = this.end;
            }
            if (daysToInter > 0 && firstStartSecondEnd < 0 && daysToEnd > 0 && firstEndSecondStart > 0) {
                interStart = this.start;
                interEnd = second.end;
            }
            if (daysToInter < 0 && firstStartSecondEnd < 0 && daysToEnd > 0 && firstEndSecondStart > 0) {
                interStart = second.start;
                interEnd = second.end;
            }
            if (daysToInter == 0 && firstStartSecondEnd < 0 && daysToEnd == 0 && firstEndSecondStart > 0) {
                interStart = this.start;
                interEnd = second.end;
            }
            if (daysToInter == 0 && firstStartSecondEnd < 0 && daysToEnd < 0 && firstEndSecondStart > 0) {
                interStart = this.start;
                interEnd = this.end;
            }
            if (daysToInter == 0 && firstStartSecondEnd < 0 && daysToEnd > 0 && firstEndSecondStart > 0) {
                interStart = this.start;
                interEnd = second.end;
            }
            if (daysToInter < 0 && firstStartSecondEnd < 0 && daysToEnd == 0 && firstEndSecondStart > 0) {
                interStart = second.start;
                interEnd = second.end;
            }
            if (daysToInter > 0 && firstStartSecondEnd < 0 && daysToEnd == 0 && firstEndSecondStart > 0) {
                interStart = this.start;
                interEnd = second.end;
            }
            if (daysToInter < 0 && firstStartSecondEnd < 0 && daysToEnd < 0 && firstEndSecondStart == 0) {
                interStart = this.end;
                interEnd = second.start;
            }
            if (daysToInter > 0 && firstStartSecondEnd == 0 && daysToEnd > 0 && firstEndSecondStart > 0) {
                interStart = this.start;
                interEnd = second.end;
            }

            inter = new DatePeriod(interStart, interEnd);
        } else {
            inter = null;
        }
        return inter;
    }
}
