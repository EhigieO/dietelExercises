package bankApplication;

import java.util.ArrayList;

public class Bank {
//    int accountNumber;
    private static ArrayList<Customer> allCustomers = new ArrayList<Customer>();
    public static void createCustomer(String firstName, String lastName, String phoneNumber, int initialDeposit) {
        Customer newCustomer = new Customer();
        allCustomers.add(newCustomer);
        newCustomer.setPhoneNumber(phoneNumber);
        newCustomer.setFirstName(firstName);
        newCustomer.setLastName(lastName);
        newCustomer.deposit(initialDeposit);
    }

    public int getCustomerSize() {
        return allCustomers.size();
    }

    public static void deleteCustomer(int accountNumber) {
        allCustomers.remove(accountNumber - 1);

    }

    public static ArrayList<Customer> getAllCustomers() {
        System.out.println(allCustomers);
        return allCustomers;
    }

//    public int getAccountNumber() {
//        return accountNumber;
//    }
}