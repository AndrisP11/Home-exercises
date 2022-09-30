package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please enter server launch year: ");
        int launchYear = key.nextInt();
        System.out.print("Please enter server launch month: ");
        int launchMonth = key.nextInt();
        System.out.print("Please enter server launch day: ");
        int launchDay = key.nextInt();
        LocalDate launchDate = LocalDate.of(launchYear, launchMonth, launchDay);
        System.out.println("Server was launched at: " + launchDate);

        System.out.print("Please select the year: ");
        int year = key.nextInt();
        System.out.print("Please select the month: ");
        int month = key.nextInt();
        int daysInMonth = getMonthDays(year, month);
        int updateDay = launchDay + 14;
        if (updateDay > daysInMonth) {
            updateDay = ((updateDay) - 30);
        }
        if (updateDay > launchDay) {
            LocalDate firstUpdate = LocalDate.of(2022, month, launchDay);
            LocalDate secondUpdate = LocalDate.of(2022, month, updateDay);
            System.out.println("First server update at " + firstUpdate);
            System.out.println("Second server update at " + secondUpdate);
        } else {
            LocalDate firstUpdate = LocalDate.of(2022, month, updateDay);
            LocalDate secondUpdate = LocalDate.of(2022, month, launchDay);
            System.out.println("First server update at " + firstUpdate);
            System.out.println("Second server update at " + secondUpdate);

        }
    }

    private static int getMonthDays(int year, int month) {
        YearMonth yearMonthObject = YearMonth.of(year, month);
        return yearMonthObject.lengthOfMonth();
    }
}
