package io.codelex.polymorphism.practice.exercise4;

public class Commision extends Hourly {

    private double totalSales = 0;
    private double commissionRateForEmployee;

    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRateForEmployee) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRateForEmployee = commissionRateForEmployee;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double pay = super.pay() + (totalSales * commissionRateForEmployee);
        totalSales = 0;
        return pay;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}
