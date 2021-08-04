package bankapp;

public class Customer extends User{
    private Account account = new Account();

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

}
