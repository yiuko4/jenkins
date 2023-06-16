package Bank;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import java.util.Map;

class BankTest {
    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    static Stream<String> accountNumbers() {
        return Stream.of("123", "456", "789");
    }


    @ParameterizedTest
    @MethodSource("accountNumbers")
    void testAddAccount(String accountNumber) {
        bank.addAccount(accountNumber, 1000);
        Map<String, Double> balances = bank.getAllAccountBalances();
        assertTrue(balances.containsKey(accountNumber));
        assertEquals(1000, balances.get(accountNumber));
    }

    @ParameterizedTest
    @MethodSource("accountNumbers")
    void testRemoveAccount(String accountNumber) {
        bank.addAccount(accountNumber, 1000);
        bank.removeAccount(accountNumber);
        Map<String, Double> balances = bank.getAllAccountBalances();
        assertFalse(balances.containsKey(accountNumber));
    }

    // Une méthode source additionnelle pour tester les transferts
    static Stream<String[]> accountPairs() {
        return Stream.of(new String[] {"123", "456"}, new String[] {"456", "789"});
    }

    @ParameterizedTest
    @MethodSource("accountPairs")
    void testTransfer(String fromAccount, String toAccount) throws Exception {
        bank.addAccount(fromAccount, 1000);
        bank.addAccount(toAccount, 500);
        bank.transfer(fromAccount, toAccount, 500);
        Map<String, Double> balances = bank.getAllAccountBalances();
        assertEquals(500, balances.get(fromAccount));
        assertEquals(1000, balances.get(toAccount));
    }
}
