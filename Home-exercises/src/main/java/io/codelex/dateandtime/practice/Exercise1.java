package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.EnumSet;
import java.util.Set;


public class Exercise1 {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2015, 2, 10);
        LocalDate endDate = LocalDate.now();


        Set<DayOfWeek> weekend = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        final long weekDaysBetween = startDate.datesUntil(endDate)
                .filter(d -> !weekend.contains(d.getDayOfWeek()))
                .count();

        System.out.println("Started working at: " + startDate);
        System.out.println("Worked until: " + endDate);
        System.out.println("Worked " + weekDaysBetween + " days");
        System.out.println("Worked " + (weekDaysBetween * 8) + " hours");
    }


}
