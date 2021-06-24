package BankApplication;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> allCustomers = new ArrayList<Customer>();
    public void createCustomer(int initialDeposit) {
        Customer newCustomer = new Customer();
        allCustomers.add(newCustomer);
        newCustomer.deposit(initialDeposit);
    }

    public int getCustomerList() {
        return allCustomers.size();
    }
}
