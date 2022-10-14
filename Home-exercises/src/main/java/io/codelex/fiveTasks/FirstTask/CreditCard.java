package io.codelex.fiveTasks.FirstTask;

import java.math.BigDecimal;
import java.util.Scanner;

public class CreditCard extends Card {
    public CreditCard(int number, String fullName, String CCVcode, BigDecimal balance) {
        super(number, fullName, CCVcode, balance);
    }

    @Override
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input amount to withdraw: ");
        BigDecimal amount = sc.nextBigDecimal();
        if (getBalance().subtract(amount).compareTo(new BigDecimal(0)) < 0) {
            throw new NotEnoughFundsException("Not enough money in account!");
        }
        setBalance(getBalance().subtract(amount));
        if (getBalance().compareTo(new BigDecimal(100)) < 0) {
            System.out.println("Warning: Low funds");
        }
        System.out.println(getBalance());
        sc.close();
    }

    @Override
    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input amount to deposit: ");
        BigDecimal amount = sc.nextBigDecimal();
        setBalance(getBalance().add(amount));
        System.out.println(getBalance());
        sc.close();
    }
}


