package com.thegeeksdiary.encapsulation;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe", 5000);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Current balance: " + account.getBalance());

        account.deposit(1000);
        System.out.println("Current balance after deposit: " + account.getBalance());

        account.withdraw(3000);
        System.out.println("Current balance after withdrawal: " + account.getBalance());

        account.withdraw(5000);
    }
}
