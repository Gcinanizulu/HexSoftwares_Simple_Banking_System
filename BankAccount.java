import java.util.Scanner;

public class BankAccount {

    Customer customer;
    int Balance;

    public BankAccount(Customer customer) {
        this.customer = customer;
    }

    public int Balance(){
        return Balance;
    }

    public int withDraw(int amount) {
        if (Balance < amount) {
            System.err.println("Incufitiant balance");
            return Balance;
        } else {
            Balance -= amount;
            System.out.printf("Successfuly withdrawn R%d. ", amount);
            return Balance;
        }
    }
    public int deposite(int amount) {
        Balance += amount;
        System.out.printf("Successfuly deposited R%d. ", amount);
        return Balance;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello new customer. Would you like to create a banking account with us \n1 or Yes\n2 or No");
        boolean bool = true;
        BankAccount account;
        while (bool) {
            String creating = scanner.nextLine();
            try {
                int option = Integer.parseInt(creating);
                if (option != 1) {
                    System.out.println("Thanks for your visit, hope you enjoyed it");
                    System.exit(0);
                } else {
                    bool = false;
                }

            } catch(Exception e) {
                creating.toLowerCase();
                if (!creating.equals("yes")) {
                    if (creating.equals("no")) {
                        System.out.println("Thanks for your visit, hope you enjoyed it");
                        System.exit(0);
                    } else {
                        System.err.println("Please choose one between the above options");
                    }
                } else {
                    bool = false;
                }
            }
        }
        account = new BankAccount(accountInfo(scanner));
        System.out.println("What can I help you wit today? ");
        bool = true;
        while (bool) {
            System.out.println("1. Show Balance \n2. Withdraw from account \n3.Deposite into account \n4. Exit Application");
            String options = scanner.nextLine();
            switch (options) {
                case "1":
                    System.out.printf("Your balance R%d\n", account.Balance());
                    break;
                case "2":
                    System.out.print("Amount to be withdrawn: R");
                    int withdraw = Integer.parseInt(scanner.nextLine());
                    account.withDraw(withdraw);
                    System.out.printf("Your balance R%d\n", account.Balance());
                    break;
                case "3":
                    System.out.print("Amount to be deposited: R");
                    int deposite = Integer.parseInt(scanner.nextLine());
                    account.deposite(deposite);
                    System.out.printf("Your balance R%d\n", account.Balance());
                    break;
                case "4":
                    System.out.printf("Thank you for visiting, hope you enjoyed and see you again.");
                    System.exit(0);
                    break;
                default:
                    System.err.printf("Please choose one of the above options.");
                    break;
            }
        }
    }
    private static Customer accountInfo(Scanner scanner) {
        Customer customer;
        System.out.print("First name(s): ");
        String name = scanner.nextLine();

        System.out.print("Surname name: ");
        String surname = scanner.nextLine();

        System.out.print("Gender : \n1. Mr \n2. Mrs \n3. Miss \n4. Dr");
        String gender = scanner.nextLine();

        System.out.print("Ten digit South African(+27) phone number: ");
        String number = scanner.nextLine();
        if (number.length() != 10) System.err.println("Please make sure that you have 10 digits for your cell number");
        int phone_number = Integer.parseInt(number);

        customer = new Customer(name, surname, phone_number, gender);
        System.out.printf("Account created for %s %s %s\n", customer.gender, customer.Surname, customer.Name);
        System.out.println();
        return customer;
    }

}   
