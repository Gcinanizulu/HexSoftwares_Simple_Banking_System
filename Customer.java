/**
 * Represents a customer of the bank.
 */
public class Customer {
    int Phone_number;
    String Name, Surname, gender;

    /**
     * Constructs a Customer object and assigns a title based on input.
     *
     * @param Name        First name(s) of the customer.
     * @param Surname     Last name of the customer.
     * @param Phone_number 10-digit phone number.
     * @param gender      Gender code (1=Mr, 2=Mrs, 3=Miss, 4=Dr).
     */
    public Customer(String Name, String Surname, int Phone_number, String gender) {
        this.Name = Name;
        this.Surname = Surname;
        this.Phone_number = Phone_number;

        switch (gender) {
            case "1": this.gender = "Mr"; break;
            case "2": this.gender = "Mrs"; break;
            case "3": this.gender = "Miss"; break;
            case "4": this.gender = "Dr"; break;
            default: this.gender = "NON"; break;
        }
    }
}
