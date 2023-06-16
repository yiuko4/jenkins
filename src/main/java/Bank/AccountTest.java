package Bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    static Stream<Account> createAccounts() {
        return Stream.of(
                new Account("A001", 1000.0, 0.05),
                new Account("A002", 2000.0, 0.1),
                new Account("A003", 500.0, 0.02)
        );
    }

    @ParameterizedTest
    @MethodSource("createAccounts")
    void getAccountId(Account account) {
        assertEquals(account.getAccountId(), account.getAccountId());
    }

    @ParameterizedTest
    @MethodSource("createAccounts")
    void getBalance(Account account) {
        assertEquals(account.getBalance(), account.getBalance());
    }

    @ParameterizedTest
    @MethodSource("createAccounts")
    void getInterestRate(Account account) {
        assertEquals(account.getInterestRate(), account.getInterestRate());
    }

    @ParameterizedTest
    @MethodSource("createAccounts")
    void deposit(Account account) {
        double initialBalance = account.getBalance();
        double amount = 500.0;
        account.deposit(amount);
        assertEquals(initialBalance + amount, account.getBalance());
    }

    @ParameterizedTest
    @MethodSource("createAccounts")
    void calculateInterest(Account account) {
        double interest = account.calculateInterest();
        assertEquals(account.getBalance() * account.getInterestRate(), interest);
    }
}