package bankapp;

import javax.security.auth.login.CredentialException;
import java.util.ArrayList;
import java.util.List;

public class Bank {
   private List<Customer> customers = new ArrayList<>();
   private List<Account> accounts = new ArrayList<>();
   private List<Staff> staffs = new ArrayList<>();

   public void register(Customer myCustomer) {
      customers.add(myCustomer);
   }

   public boolean isLogin(int accountNumber, String pin) {
      for (Customer customer : customers) {
         if (customer.getAccount().getAccountNo() == accountNumber) {
            if (customer.getAccount().getPin().equals(pin)) {
               return true;
            }
         }
      }
      return false;
   }

   public void transfer(int accountNumber, int receiverAccountNumber, int amount, String pin) throws CredentialException {
         if (isLogin(accountNumber,pin)){
            for (Customer customer : customers) {
               if (customer.getAccount().getAccountNo() == receiverAccountNumber) {
                  if (getCustomerAccountNumber(accountNumber).getAccount().getBalance() > amount) {
                     getCustomerAccountNumber(accountNumber).getAccount().withdraw(amount);
                     customer.getAccount().deposit(amount);
                  } else
                     throw new IllegalArgumentException("Insufficient account balance");
               }
            }
         } else
            throw new CredentialException("Invalid pinCode");

   }

   public Customer getCustomerAccountNumber(int accountNumber) {
      for (Customer customer : customers) {
         if (customer.getAccount().getAccountNo() == accountNumber) {
            return customer;
         }
      }

      throw new NullPointerException("customer does not exist");
   }

}
