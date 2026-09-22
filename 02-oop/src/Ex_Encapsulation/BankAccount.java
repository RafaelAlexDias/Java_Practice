package Ex_Encapsulation;

public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("The deposit of " + amount + " was successful!");
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance = this.balance - amount;
                System.out.println("The withdraw of " + amount + " was successful!");
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid withdraw");
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
