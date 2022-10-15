package io.codelex.fiveTasks.FirstTask;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(int number, String fullName, String CCVcode, BigDecimal balance) {
        super(number, fullName, CCVcode, balance);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (getBalance().subtract(amount).compareTo(new BigDecimal(0)) < 0) {
            throw new NotEnoughFundsException("Not enough money in account!");
        }
        setBalance(getBalance().subtract(amount));
        if (getBalance().compareTo(new BigDecimal(100)) < 0) {
            System.out.println("Warning: Low funds");
        }
        System.out.println(getBalance());
    }

    @Override
    public void deposit(BigDecimal amount) {
        setBalance(getBalance().add(amount));
        System.out.println(getBalance());

    }
}


