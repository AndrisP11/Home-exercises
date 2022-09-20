package io.codelex.classesandobjects.practice.Exercise8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount {
    private BigDecimal annualInterestRate;
    private BigDecimal balance;

    public SavingsAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdrawal(BigDecimal amount) {
        if (amount.compareTo(this.balance) > 0) {
            System.out.println("Invalid Operation! Balance is smaller then amount you want to withdraw.");
        } else {
            this.balance = this.balance.subtract(amount);
        }
    }

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public BigDecimal monthlyInterest() {

        BigDecimal monthlyInterest = this.annualInterestRate.divide(BigDecimal.valueOf(12), 5, RoundingMode.HALF_UP).multiply(this.balance);
        this.balance = monthlyInterest.add(this.balance);
        return monthlyInterest;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
