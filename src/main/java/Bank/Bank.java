package Bank;

import java.util.*;

public class Bank {
    private Map<String, Double> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, double initialBalance) {
        this.accounts.put(accountNumber, initialBalance);
    }

    public void removeAccount(String accountNumber) {
        this.accounts.remove(accountNumber);
    }

    public Map<String, Double> getAllAccountBalances() {
        return new HashMap<>(this.accounts);
    }

    public void transfer(String fromAccount, String toAccount, double amount) throws Exception {
        if (amount <= 0) throw new Exception("pas le bon montant");
        double fromBalance = this.accounts.get(fromAccount);
        double toBalance = this.accounts.get(toAccount);

        if (fromBalance < amount) throw new Exception("pas assez de sousous");

        this.accounts.put(fromAccount, fromBalance - amount);
        this.accounts.put(toAccount, toBalance + amount);
    }
}
