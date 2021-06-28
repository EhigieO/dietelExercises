package bankapp;

public class Customer extends User{
    private Account account;
    long accountNumber;

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Customer(String firstName, String lastName, Account account) {
        super(firstName, lastName);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }



    public void setAccountNumber() {
        accountNumber = account.setAccountNo(1000);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void deposit(int amount) {
        account.deposit(amount);
    }

    public void withdraw(int amountToWithdraw) {
        account.withdraw(amountToWithdraw);
    }
}
