public class Customer {
    int Phone_number;
    String Name, Surname,gender;

    public Customer(String Name, String Surname, int Phone_number, String gender) {
        this.Name = Name;
        this.Surname = Surname;
        this.Phone_number = Phone_number;
        this.gender = gender;
        
        if (gender.equals("1")) this.gender = "Mr";
        else if (gender.equals("2")) this.gender = "Mrs";
        else if (gender.equals("4")) this.gender = "Dr";
        else if (gender.equals("3")) this.gender = "Miss";
        else {
            this.gender = "NON";
        }
    }
}
