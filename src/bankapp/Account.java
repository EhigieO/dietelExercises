package bankapp;

public class Account {

    private long accountNo;
    private AccountType accountType;
    private double balance;
    private String pin;
    private int counter;
    private String firstName;


    public Account() {
        counter++;
        balance = 0.0;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public long setAccountNo(int accountNo) {
        this.accountNo = accountNo + counter;
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

    public void transfer(Account account2, double amount) {
        withdraw(amount);
        account2.deposit(amount);
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return firstName;
    }
}
