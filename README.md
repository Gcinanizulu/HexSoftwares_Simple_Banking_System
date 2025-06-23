# Simple Banking Application

This Java console-based banking system allows users to create a bank account and perform basic transactions such as deposits, withdrawals, and balance inquiries. The user interacts with the program through command-line prompts.

## 📦 Project Structure

- `Customer.java`: Represents customer information, including name, phone number, and title (gender-based).
- `BankAccount.java`: Manages bank account operations like deposit, withdrawal, and balance display.

## 🚀 How to Run

1. Compile both Java files:
   ```sh
   javac Customer.java BankAccount.java
2. - Run the main class:
   ```sh
    java BankAccount

📋 Features

- Customer account creation with name, surname, gender, and phone number.
- Depositing and withdrawing funds.
- Displaying current account balance.
- Console interaction with error handling for input.

🔧 Notes

- Phone number input expects exactly 10 digits (excluding +27).
- Gender is selected via numeric values and converted into a title (Mr, Mrs, etc.).
- No persistent storage — data is stored only in memory during runtime.
