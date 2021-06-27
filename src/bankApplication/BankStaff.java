package bankApplication;

public class BankStaff {

    private String firstName;
    private String lastName;
    private static String pin;
    private static String userName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public static String getPin() {
        return pin;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static String getUserName() {
        return userName;
    }

}