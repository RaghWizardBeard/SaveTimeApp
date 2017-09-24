package DataClasses;


import java.util.Date;



abstract class Person
{
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected int ID;
    protected Date date;
    protected Date dob;
    protected String email;
    protected String address;
    protected String city;
    protected String state;
    protected int zipCode;
    protected String country;
    protected int phoneNumber;

    protected Person(String firstName, String lastName, String userName, int ID, Date date, Date dob, String email, String address,
                  String city, String state, int zipCode, String country, int phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.ID = ID;
        this.date = date;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    protected String getFirstName()
    {
        return firstName;
    }

    protected void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    protected String getLastName()
    {
        return lastName;
    }

    protected void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    protected String getUserName()
    {
        return userName;
    }

    protected void setUserName(String userName)
    {
        this.userName = userName;
    }

    protected int getID()
    {
        return ID;
    }

    protected void setID(int ID)
    {
        this.ID = ID;
    }

    protected Date getDate()
    {
        return date;
    }

    protected void setDate(Date date)
    {
        this.date = date;
    }

    protected Date getDob()
    {
        return dob;
    }

    protected void setDob(Date dob)
    {
        this.dob = dob;
    }

    protected String getEmail()
    {
        return email;
    }

    protected void setEmail(String email)
    {
        this.email = email;
    }

    protected String getAddress()
    {
        return address;
    }

    protected void setAddress(String address)
    {
        this.address = address;
    }

    protected String getCity()
    {
        return city;
    }

    protected void setCity(String city)
    {
        this.city = city;
    }

    protected String getState()
    {
        return state;
    }

    protected void setState(String state)
    {
        this.state = state;
    }

    protected int getZipCode()
    {
        return zipCode;
    }

    protected void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }

    protected String getCountry()
    {
        return country;
    }

    protected void setCountry(String country)
    {
        this.country = country;
    }

    protected int getPhoneNumber()
    {
        return phoneNumber;
    }

    protected void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", ID=" + ID +
                ", date=" + date +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", country='" + country + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
