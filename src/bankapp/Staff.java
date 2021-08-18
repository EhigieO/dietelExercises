package bankapp;

import java.security.InvalidParameterException;

public class Staff extends User{

    private String password;

    public Staff(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setPassword(String password) {
        if (password.length() > 3 && password.length() < 11){
            this.password = password;} else throw new InvalidParameterException("Enter a valid password");
    }

    public String getPassword() {
        return password;
    }
}
