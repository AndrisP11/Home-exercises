package io.codelex.classesandobjects.practice.Exercise13;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account", 100.00);
        bartosAccount.deposit(20);
        System.out.println(bartosAccount);
        System.out.println();

        Account mattAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("My account", 0);
        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattAccount);
        System.out.println(myAccount);
        System.out.println();

        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);
        transfer(A, B, 50);
        transfer(B, C, 25);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
