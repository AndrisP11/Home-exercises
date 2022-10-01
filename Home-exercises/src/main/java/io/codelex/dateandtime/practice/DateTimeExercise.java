package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Stream;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static List<LocalDate> findNextFriday13th(LocalDate from) {

        LocalDate now = LocalDate.now();

        long numOfDays = ChronoUnit.DAYS.between(from, now);

        List<LocalDate> listOfDates = Stream.iterate(from, date -> date.plusDays(1))
                .limit(numOfDays).toList();

        List<LocalDate> listOfFridayThirteenth = listOfDates.stream()
                .filter(localDate -> localDate.getDayOfMonth() == 13 && localDate.getDayOfWeek()
                        .equals(DayOfWeek.FRIDAY)).toList();
        System.out.println("Days between two dates: " + listOfDates.size());
        return listOfFridayThirteenth;

    }

    public static void main(String[] args) {
        List<LocalDate> listOfFridayThirteenth = findNextFriday13th(createNewYearsEve2017());

        System.out.print("Dates of friday the thirteenth: ");
        listOfFridayThirteenth.forEach(localDate -> {
            System.out.print(localDate + " ");
        });
        System.out.println();
        System.out.println("Number of friday thirteenth between " + createNewYearsEve2017() + " and " + LocalDate.now() + " is: " + listOfFridayThirteenth.size());
    }
}
