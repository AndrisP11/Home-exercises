package io.codelex.classesandobjects.practice.Exercise10;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        //todo
        this.balance = this.balance + amount;
    }

    public final void withdraw(double amount) {
        //todo
        this.balance = this.balance - amount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Benson", 17.25);
        System.out.println(account1);
        account1.withdraw(100.30);
        System.out.println(account1);
        account1.deposit(85.05);
        System.out.println(account1);
    }

    @Override
    public String toString() {
        String minus;
        if (this.balance < 0) {
            minus = "-";
        } else {
            minus = "";
        }
        return name + ", " + minus + "$"
                + currencyFormat(Math.abs(this.balance));
    }

    public static String currencyFormat(double n) {
        DecimalFormat f = new DecimalFormat("#,###.00",
                new DecimalFormatSymbols(Locale.US));
        return f.format(n);
    }
}
