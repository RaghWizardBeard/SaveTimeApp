package DataClasses;

import java.util.Date;

public class Client extends Person
{

    public Client(String firstName, String lastName, String userName, int ID, Date date, Date dob, String email, String address, String city, String state, int zipCode, String country, int phoneNumber) {
        super(firstName, lastName, userName, ID, date, dob, email, address, city, state, zipCode, country, phoneNumber);
    }
}
