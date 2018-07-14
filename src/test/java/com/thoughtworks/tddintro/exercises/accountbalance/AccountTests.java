package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        // Arrange
        Account account = new Account();

        // Action
        int currentBalance = account.getBalance();
        account.depositMoney(5);
        int endingBalance = account.getBalance();

        // Assert
        assertTrue(endingBalance > currentBalance);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        // Arrange
        Account account = new Account();

        // Action
        int currentBalance = account.getBalance();
        account.withdrawMoney(5);
        int endingBalance = account.getBalance();

        // Assert
        assertTrue(endingBalance < currentBalance);

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
