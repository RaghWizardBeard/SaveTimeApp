package DataClasses;

import java.util.Date;

public class Professional extends Client
{
    private String businessName;
    private int businessPhoneNumber;
    private String businessAddress;

    public Professional(String firstName, String lastName, String userName, int ID, Date date, Date dob, String email, String address, String city, String state, int zipCode, String country, int phoneNumber) {
        super(firstName, lastName, userName, ID, date, dob, email, address, city, state, zipCode, country, phoneNumber);
    }

    @Override
    public String toString()
    {
        super.toString();
        return "Professional{" +
                "businessName='" + businessName + '\'' +
                ", businessPhoneNumber=" + businessPhoneNumber +
                ", businessAddress='" + businessAddress + '\'' +
                '}';
    }

    private String getBusinessName()
    {
        return businessName;
    }

    private void setBusinessName(String businessName)
    {
        this.businessName = businessName;
    }

    private int getBusinessPhoneNumber()
    {
        return businessPhoneNumber;
    }

    private void setBusinessPhoneNumber(int businessPhoneNumber)
    {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    private String getBusinessAddress()
    {
        return businessAddress;
    }

    private void setBusinessAddress(String businessAddress)
    {
        this.businessAddress = businessAddress;
    }
}
