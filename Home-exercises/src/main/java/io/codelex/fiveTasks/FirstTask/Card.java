package io.codelex.fiveTasks.FirstTask;

import java.math.BigDecimal;

public abstract class Card {
    private int number;
    private String fullName;
    private String CCVcode;
    private BigDecimal balance;

    public Card(int number, String fullName, String CCVcode, BigDecimal balance) {
        this.number = number;
        this.fullName = fullName;
        this.CCVcode = CCVcode;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCCVcode() {
        return CCVcode;
    }

    public void setCCVcode(String CCVcode) {
        this.CCVcode = CCVcode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public abstract void withdraw(BigDecimal amount);

    public abstract void deposit(BigDecimal amount);
}
