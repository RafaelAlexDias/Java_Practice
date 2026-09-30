package banking;

import exceptions.AccountNotFoundException;
import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

/**
 * Banking System demo.
 *
 * Creates two accounts and walks through the happy path of deposit, withdraw
 * and transfer, ending with the final balances.
 */
public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        BankAccount rafael =
                new BankAccount(
                        "PT001",
                        "Rafael",
                        1000
                );

        BankAccount joao =
                new BankAccount(
                        "PT002",
                        "João",
                        500
                );

        bank.addAccount(rafael);
        bank.addAccount(joao);

        try {

            System.out.println("Initial balances:");
            System.out.println(
                    "Rafael: " + rafael.getBalance()
            );
            System.out.println(
                    "João: " + joao.getBalance()
            );

            System.out.println("\n--- Deposit ---");

            rafael.deposit(200);

            System.out.println("\n--- Withdraw ---");

            rafael.withdraw(100);

            System.out.println("\n--- Transfer ---");

            bank.transfer(
                    "PT001",
                    "PT002",
                    300
            );

            System.out.println("\nFinal balances:");

            System.out.println(
                    "Rafael: " + rafael.getBalance()
            );

            System.out.println(
                    "João: " + joao.getBalance()
            );

        } catch (
                AccountNotFoundException |
                InvalidAmountException |
                InsufficientBalanceException e
        ) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}