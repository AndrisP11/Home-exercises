package io.codelex.classesandobjects.practice.Exercise5;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(4, 22, 1982);
        date1.displayDate();
        date1.setDay(11);
        date1.setMonth(10);
        date1.displayDate();
        System.out.println(date1.getYear());
        Date date2 = new Date(6, 15, 1673);
        date2.displayDate();
        date2.setYear(1576);
        date2.displayDate();
    }
}
