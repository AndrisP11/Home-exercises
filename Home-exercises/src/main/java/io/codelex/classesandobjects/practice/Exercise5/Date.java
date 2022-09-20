package io.codelex.classesandobjects.practice.Exercise5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate() {
        LocalDate date = LocalDate.of(getYear(), getMonth(), getDay());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(formatter.format(date));
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
