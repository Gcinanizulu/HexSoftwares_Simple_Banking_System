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
            return Balance;
        }
    }
    public int deposite(int amount) {
        Balance += amount;
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
                if (option == 1) {
                    account = new BankAccount(accountInfo(scanner));
                    bool = false;
                } else {
                    System.out.println("Thanks for your visit, hope you enjoyed it");
                }

            } catch(Exception e) {
                creating.toLowerCase();
                if (creating.equals("yes")) {
                    account = new BankAccount(accountInfo(scanner));
                    bool = false;
                }
                else if (creating.equals("no")) {
                    System.out.println("Thanks for your visit, hope you enjoyed it");
                }
                else {
                    System.err.println("Please choose one between the above options");
                }
            }
        }
        
    }
    private static Customer accountInfo(Scanner scanner) {
        Customer customer;
        System.out.print("First name(s): ");
        String name = scanner.nextLine();
        //System.out.println();

        System.out.print("Surname name: ");
        String surname = scanner.nextLine();
        //System.out.println();

        System.out.println("Gender : \n1. Mr \n2. Mrs \n3. Miss \n4. Dr");
        String gender = scanner.nextLine();
        //System.out.println();

        System.out.print("Ten digit South African(+27) phone number: ");
        int phone_number = Integer.parseInt(scanner.nextLine());
        System.out.println();

        customer = new Customer(name, surname, phone_number, gender);
        System.out.println("Account created for %s %s %s", customer.gender, customer.surname, customer.name);
        return customer;
    }

}   
