package bankapp;

public class Account {
    private static int accountNoGenerator = 700455500;
    private final int accountNo;
    private AccountType accountType = AccountType.SAVINGS;
    private double balance;
    private String pin = "0000";
    private String firstName;
    private String lastName;

    public Account() {
        accountNoGenerator += 1;
        this.accountNo = accountNoGenerator;

    }

    public int getAccountNo() {
        return accountNo;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName; this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}
