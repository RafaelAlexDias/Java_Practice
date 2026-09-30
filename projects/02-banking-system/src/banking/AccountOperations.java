package banking;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

/**
 * Contract for money operations on a bank account.
 *
 * Both methods validate the amount first and use checked exceptions so the
 * caller is forced to decide how to handle an invalid or impossible operation.
 */
public interface AccountOperations {

    void deposit(double amount) throws InvalidAmountException;

    void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException;
}