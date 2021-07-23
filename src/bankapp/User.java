package bankapp;

import java.security.InvalidParameterException;

public class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public User(){
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        if (password.length() > 3 && password.length() < 11){
        this.password = password;} else throw new InvalidParameterException("Enter a valid password");
    }

    public String getPassword() {
        return password;
    }
}
