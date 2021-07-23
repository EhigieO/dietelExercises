package bankapp;

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
         if (customer.getAccountNumber() == accountNumber) {
            if (customer.getPassword() == pin) {
               return true;
            }
         }
      }
      return false;
   }

   public void transfer(int accountNumber, int transfereeAccountNumber, int amount, String pin) {
         if (isLogin(accountNumber,pin)){
            for (Customer customer : customers) {
               if (customer.getAccountNumber()==transfereeAccountNumber){
                  if (getCustomerAccountNumber(accountNumber).getAccount().getBalance() > amount){
                     getCustomerAccountNumber(accountNumber).withdraw(amount);
                     customer.deposit(amount);
                  }
               }
            }
         }

   }

   public Customer getCustomerAccountNumber(int accountNumber) {
      for (Customer customer : customers) {
         if (customer.getAccountNumber() == accountNumber) {
            return customer;
         }
      }

      throw new NullPointerException("customer does not exist");
   }

}
