package com.telusko.TestLearning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0);
    }

    @Test
    @DisplayName("Deposit should increase balance correctly")
    void deposit_shouldIncreaseBalance() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    @DisplayName("Withdraw should decrease balance when funds are sufficient")
    void withdraw_shouldDecreaseBalance_whenFundsSufficient() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    @DisplayName("Withdraw beyond balance should throw exception")
    void withdraw_shouldThrow_whenInsufficientFunds() {
        assertThrows(IllegalStateException.class, () -> account.withdraw(2000.0));
    }

    @Test
    @DisplayName("Negative initial balance should throw exception")
    void constructor_shouldThrow_whenNegativeInitialBalance() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount(-100));
    }
}
