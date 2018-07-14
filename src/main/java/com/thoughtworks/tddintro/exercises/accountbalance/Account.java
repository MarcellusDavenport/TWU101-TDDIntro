package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private int balance;

    public Account(int i) {
        this.balance = i;
    }

    public int getBalance() {
        return this.balance;
    }

    public void depositMoney(int i) {
        this.balance += i;
    }

    public void withdrawMoney(int i) {
        if (i > this.balance) {
            this.balance = i - this.balance;
        } else {
            this.balance -= i;
        }
    }
}
