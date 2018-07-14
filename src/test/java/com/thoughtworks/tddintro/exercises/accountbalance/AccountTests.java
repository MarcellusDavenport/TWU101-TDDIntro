package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        // Arrange
        Account account = new Account(100);

        // Action
        account.depositMoney(50);
        int endingBalance = account.getBalance();

        // Assert
        assertTrue(endingBalance == 150);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        // Arrange
        Account account = new Account(100);

        // Action
        account.withdrawMoney(50);
        int endingBalance = account.getBalance();

        // Assert
        assertTrue(endingBalance == 50);

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        // Arrange
        Account account = new Account(50);

        // Action
        account.withdrawMoney(100);
        int currentBalance = account.getBalance();

        // Assert
        assertTrue(currentBalance == 50);
    }
}
