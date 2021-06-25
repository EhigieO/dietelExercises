package BankApplication;

import chapterThreeExercises.Account;

public class Customer {
    private static String firstName;
    private String lastName;
    private String phoneNumber;
    private static String pin;
    private static Account account = new Account();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static String getFirstName() {
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

    public void setPin(String pin) {
        this.pin = pin;
    }

    public static String getPin() {
        return pin;
    }

    public static void deposit(int depositAmount) {
        account.deposit(depositAmount);
    }

    public double getBalance() {
        return account.getBalance();
    }

    public static void withdraw(int withdrawAmount) {
        account.withdraw(withdrawAmount);
    }

    public static void transfer(int transferAmount, int receivingAccount) {
        account.transfer(transferAmount,receivingAccount);
    }

    public String toString(){
        return firstName + " " + lastName + " " + phoneNumber;
    }
}