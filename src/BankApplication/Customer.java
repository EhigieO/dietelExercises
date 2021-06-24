package BankApplication;

import chapterThreeExercises.Account;

public class Customer {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int pin;
    private Account account = new Account();

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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void deposit(int depositAmount) {
        account.deposit(depositAmount);
    }

    public double getBalance() {
        return account.getBalance();
    }

    public void withdraw(int withdrawAmount) {
        account.withdraw(withdrawAmount);
    }

    public void transfer(int transferAmount,Account receivingAccount) {
        account.transfer(transferAmount,receivingAccount);
    }
}
