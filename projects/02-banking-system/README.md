# 02 — Banking System

Practical project applying OOP, encapsulation, interfaces and custom checked
exceptions to money operations.

## Features

- Accounts with encapsulated balance (`banking.BankAccount` implements `banking.AccountOperations`)
- Deposit and withdraw with validation and custom exceptions
- `banking.Bank`: registry (`Map` by account number), lookup and transfer between accounts
- Transfers validate both accounts and the amounts before moving money

## File map

| File | Role |
|---|---|
| `src/BankAccount.java` | Account model: identity + balance, deposit/withdraw |
| `src/AccountOperations.java` | Interface contract for money ops |
| `src/Bank.java` | In-memory account registry + transfer |
| `src/Main.java` | Demo of the whole flow |
| `src/exceptions/InvalidAmountException.java` | Checked exception for non-positive amounts |
| `src/exceptions/InsufficientBalanceException.java` | Checked exception for overdrafts |
| `src/exceptions/AccountNotFoundException.java` | Checked exception for missing accounts |

## How to run

```powershell
& "C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.3\jbr\bin\javac.exe" -encoding UTF-8 -d out src/*.java src/exceptions/*.java
& "C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.3\jbr\bin\java.exe" -cp out banking.Main
```