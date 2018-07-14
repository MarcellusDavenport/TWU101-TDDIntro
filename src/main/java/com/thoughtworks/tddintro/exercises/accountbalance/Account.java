package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private int balance;

    public Account() {
        this.balance = 0;
    }

    public int getBalance() {
        return this.balance;
    }

    public void depositMoney(int i) {
        this.balance += i;
    }
}
