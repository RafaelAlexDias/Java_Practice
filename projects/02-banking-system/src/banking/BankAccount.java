package banking;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

/**
 * A single bank account: immutable identity (accountNumber, ownerName) and a
 * mutable balance managed only through deposit()/withdraw().
 *
 * Note on the money type: double is used for simplicity in this study project.
 * Real banking applications use BigDecimal to avoid floating-point rounding.
 */
public class BankAccount implements AccountOperations {

    private final String accountNumber;
    private final String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    // Encapsulation: validation happens here, so balance can never be negative
    // or receive invalid deposits through the public API.
    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount!");
        }
        this.balance += amount;
        System.out.println("Deposit successful! Balance: " + this.balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount!");
        }
        if (amount > this.balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance to withdraw!"
            );
        }
        this.balance -= amount;
        System.out.println("Withdraw successful! Balance: " + this.balance);
    }

    // Human-readable representation for debugging and printing.
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}