package banking;

import exceptions.AccountNotFoundException;
import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

import java.util.HashMap;
import java.util.Map;

/**
 * In-memory registry of accounts keyed by account number, exposing lookups and
 * transfers between accounts.
 */
public class Bank {

    private final Map<String, BankAccount> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount findAccount(String accountNumber) throws AccountNotFoundException {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            throw new AccountNotFoundException(
                    "Account not found: " + accountNumber
            );
        }
        return account;
    }

    // Transfer: withdraw from the source, then deposit into the target.
    // Note (for study): this is not atomic — if deposit() failed after the
    // withdraw, money would be lost. Real systems wrap this in a transaction.
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount)
            throws AccountNotFoundException, InvalidAmountException, InsufficientBalanceException {
        BankAccount fromAccount =
                findAccount(fromAccountNumber);
        BankAccount toAccount =
                findAccount(toAccountNumber);

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);

        System.out.println("Transfer successful!");
    }
}