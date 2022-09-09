package io.codelex.typesandvariables.practice;

public class Exercise5 {
    public static void main(String[] args) {
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Information Systems";
        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";

        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| 1 |"+String.format("%38.11s",course1)+" |"+String.format("%16.9s",teacher1)+" |");
        System.out.println("| 2 |"+String.format("%38.11s",course2)+" |"+String.format("%16.11s",teacher2)+" |");
        System.out.println("| 3 |"+String.format("%38.12s",course3)+" |"+String.format("%16.9s",teacher3)+" |");
        System.out.println("| 4 |"+String.format("%38.13s",course4)+" |"+String.format("%16.10s",teacher4)+" |");
        System.out.println("| 5 |"+String.format("%38.26s",course5)+" |"+String.format("%16.10s",teacher5)+" |");
        System.out.println("| 6 |"+String.format("%38.8s",course6)+" |"+String.format("%16.12s",teacher6)+" |");
        System.out.println("| 7 |"+String.format("%38.13s",course7)+" |"+String.format("%16.15s",teacher7)+" |");
        System.out.println("| 8 |"+String.format("%38.37s",course8)+" |"+String.format("%16.9s",teacher8)+" |");
        System.out.println("+-------------------------------------------------------------+");
    }
}
