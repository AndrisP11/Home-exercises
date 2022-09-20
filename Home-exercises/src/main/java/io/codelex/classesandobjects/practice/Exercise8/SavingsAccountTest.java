package io.codelex.classesandobjects.practice.Exercise8;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        BigDecimal balance = key.nextBigDecimal();
        System.out.print("Enter the annual interest rate: ");
        BigDecimal annualInterest = key.nextBigDecimal();
        System.out.print("How long has the account been opened? ");
        int howLong = key.nextInt();
        SavingsAccount save1 = new SavingsAccount(balance);
        save1.setAnnualInterestRate(annualInterest);
        BigDecimal totalDeposit = BigDecimal.valueOf(0);
        BigDecimal totalWithdrawn = BigDecimal.valueOf(0);
        BigDecimal intrestEarn = BigDecimal.valueOf(0);

        for (int i = 1; i <= howLong; i++) {
            System.out.print("Enter amount deposited for month: " + i + ": ");
            BigDecimal depositAmount = key.nextBigDecimal();
            totalDeposit = totalDeposit.add(depositAmount);
            save1.deposit(depositAmount);

            System.out.print("Enter amount withdrawn for month: " + i + ": ");
            BigDecimal withdrawAmount = key.nextBigDecimal();
            totalWithdrawn = totalWithdrawn.add(withdrawAmount);
            save1.withdrawal(withdrawAmount);
            intrestEarn = intrestEarn.add(save1.monthlyInterest());

        }
        System.out.println("Total deposited: $" + currencyFormat(totalDeposit));
        System.out.println("Total withdrawn: $" + currencyFormat(totalWithdrawn));
        System.out.println("Interest earned: $" + currencyFormat(intrestEarn));
        System.out.println("Ending balance: $" + currencyFormat(save1.getBalance()));
    }

    public static String currencyFormat(BigDecimal n) {
        DecimalFormat f = new DecimalFormat("#,###.00");
        return f.format(n);

    }
}
