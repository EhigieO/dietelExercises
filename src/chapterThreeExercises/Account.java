package chapterThreeExercises;

public class Account {
    private double accountBalance;
    private int pin;
    private String accountName;
    double depositAmount;

    public Account(String accountName, double accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return accountName;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0){
        accountBalance = accountBalance + depositAmount;}
        else
            System.out.println("Deposit amount is too low");
    }

    public double getBalance() {
        return accountBalance;
    }

    public void withdraw(int withdrawAmount) {
        if (withdrawAmount > 1 && withdrawAmount < accountBalance) {
            accountBalance = accountBalance - withdrawAmount;
        }
        else
            System.out.println("Check withdraw amount and try again");
    }
}
