import java.util.Scanner;

/**
 * Simulates a basic bank account system.
 */
public class BankAccount {
    Customer customer;
    int Balance;

    /**
     * Constructs a new bank account for the given customer.
     *
     * @param customer The customer linked to this account.
     */
    public BankAccount(Customer customer) {
        this.customer = customer;
    }

    /**
     * Returns the current account balance.
     *
     * @return current balance
     */
    public int Balance() {
        return Balance;
    }

    /**
     * Attempts to withdraw a given amount from the balance.
     *
     * @param amount Amount to withdraw
     * @return Updated balance
     */
    public int withDraw(int amount) {
        if (Balance < amount) {
            System.err.println("Insufficient balance");
        } else {
            Balance -= amount;
            System.out.printf("Successfully withdrawn R%d. ", amount);
        }
        return Balance;
    }

    /**
     * Deposits a given amount into the account.
     *
     * @param amount Amount to deposit
     * @return Updated balance
     */
    public int deposite(int amount) {
        Balance += amount;
        System.out.printf("Successfully deposited R%d. ", amount);
        return Balance;
    }

    /**
     * Entry point for the bank account application.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our bank!");

        while (true) {
            System.out.println("Would you like to create a banking account with us?\n1 or Yes\n2 or No");
            String creating = scanner.nextLine().trim().toLowerCase();
            if (creating.equals("1") || creating.equals("yes")) break;
            if (creating.equals("2") || creating.equals("no")) {
                System.out.println("Thanks for your visit, hope you enjoyed it!");
                return;
            }
            System.err.println("Please choose one of the above options.");
        }

        BankAccount account = new BankAccount(accountInfo(scanner));
        while (true) {
            System.out.println("\nWhat can I help you with today?");
            System.out.println("1. Show Balance\n2. Withdraw\n3. Deposit\n4. Exit");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.printf("Your balance: R%d\n", account.Balance());
                    break;
                case "2":
                    System.out.print("Withdraw amount: R");
                    account.withDraw(Integer.parseInt(scanner.nextLine()));
                    break;
                case "3":
                    System.out.print("Deposit amount: R");
                    account.deposite(Integer.parseInt(scanner.nextLine()));
                    break;
                case "4":
                    System.out.println("Thank you for visiting!");
                    return;
                default:
                    System.err.println("Please choose one of the listed options.");
            }
        }
    }

    /**
     * Gathers customer info from user input.
     *
     * @param scanner Scanner object for input
     * @return Customer object
     */
    private static Customer accountInfo(Scanner scanner) {
        System.out.print("First name(s): ");
        String name = scanner.nextLine();

        System.out.print("Surname: ");
        String surname = scanner.nextLine();

        System.out.println("Gender: \n1. Mr \n2. Mrs \n3. Miss \n4. Dr");
        String gender = scanner.nextLine();

        System.out.print("10-digit South African phone number: ");
        String number = scanner.nextLine();
        while (number.length() != 10) {
            System.err.println("Please enter exactly 10 digits.");
            number = scanner.nextLine();
        }

        int phone_number = Integer.parseInt(number);
        Customer customer = new Customer(name, surname, phone_number, gender);
        System.out.printf("Account created for %s %s %s\n", customer.gender, customer.Surname, customer.Name);
        return customer;
    }
}
