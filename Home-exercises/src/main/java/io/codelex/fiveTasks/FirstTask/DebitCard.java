package io.codelex.fiveTasks.FirstTask;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(int number, String fullName, String CCVcode, BigDecimal balance) {
        super(number, fullName, CCVcode, balance);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (getBalance().subtract(amount).compareTo(new BigDecimal(0)) < 0) {
            throw new NotEnoughFundsException("Not enough money in account!");
        }
        setBalance(getBalance().subtract(amount));
        if (getBalance().compareTo(new BigDecimal(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
        System.out.println(getBalance());
    }

    @Override
    public void deposit(BigDecimal amount) {

        setBalance(getBalance().add(amount));
        System.out.println(getBalance());
    }
}
