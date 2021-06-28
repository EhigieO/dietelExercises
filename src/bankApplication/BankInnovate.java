package bankApplication;

import chapterThreeExercises.Account;

import java.util.Scanner;

public class BankInnovate {
  //  Bank bank = new Bank();
 //   BankStaff ezeStaff = new BankStaff();
//    Customer costume = new Customer();

    public static void main(String[] args) {
//        String firstName;
//        String lastName;
//        String phoneNumber;
//        String userName;
//        String password;
//        int amount;
        System.out.println("##################################\n#    Welcome To Bank Innovate    #\n##################################");
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        String prompt = """
                1) Staff Login
                2) Customer
                3) Exit app
                """;
        while (userInput < 3) {
            System.out.println(prompt);
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    staffLogin(input);
                    break;
                case 2:
                    String prompt2 = """
                            1) Create account
                            2) Login
                            """;
                    System.out.println(prompt2);

                    userInput = input.nextInt();
                    switch (userInput) {
                        case 1:
                            createAccount(input);
                            break;
                        case 2:
                            customerLogin(input, userInput);
                            break;
                    }
                    break;

                case 3:
            }
        }
                System.out.println("##################################\n# Thank you for Banking with Us  #\n##################################");

    }

    private static void customerLogin(Scanner input, int userInput) {
        String userName;
        String phoneNumber;
        String password;
        int amount;
        System.out.print("UserName: ");
        userName = input.next();
        System.out.print("Password: ");
        password = input.next();
        if (userName.equals(Customer.getFirstName()) && password.equals(Customer.getPin())) {
            String prompt4 = """
                    1) Deposit
                    2) Withdraw
                    3) Transfer
                    4) Load Airtime
                    5) Logout
                    """;
            System.out.println(prompt4);
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = input.nextInt();
                    Customer.deposit(amount);
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = input.nextInt();
                    Customer.withdraw(amount);
                case 3:
                    System.out.print("Enter amount to transfer: ");
                    amount = input.nextInt();
                    System.out.print("Enter account name:");
//                    String account = input.nextLine();
                    chapterThreeExercises.Account account = new Account();
                    Customer.transfer(amount,account);
                case 4:
                    System.out.print("Enter amount to recharge: ");
                    amount = input.nextInt();
                    System.out.print("Enter the number to recharge");
                    phoneNumber = input.next();
                    Customer.withdraw(amount);
                case 5:
            }

        }
    }

    private static void createAccount(Scanner input) {
        String firstName;
        String lastName;
        String phoneNumber;
        int amount;
        System.out.println("Enter last name");
        lastName = input.next();
        System.out.println("Enter first name:");
        firstName = input.next();
        System.out.println("Enter phone number");
        phoneNumber = input.next();
        System.out.println("Enter account opening amount");
        amount = input.nextInt();
        Bank.createCustomer(firstName, lastName, phoneNumber, amount);
        System.out.println("Account successfully created");
    }

    private static void staffLogin(Scanner input) {
        String userName;
        String password;
        System.out.print("UserName: ");
        userName = input.next();
        System.out.print("Password: ");
        password = input.next();
        if (userName.equals(BankStaff.getUserName()) & password.equals(BankStaff.getPin())) {
            String prompt1 = """
                    1) Create customer account
                    2) View all accounts
                    3) Delete account
                    4) Logout
                    """;
            System.out.println(prompt1);
            int userInput = input.nextInt();
            while (userInput < 4){
            switch (userInput) {
                case 1:
                    createAccount(input);
                    break;
                case 2:
                    Bank.getAllCustomers();
                    break;
                case 3:
                    System.out.println("Enter account number to delete");
                    int accountNumber = input.nextInt();
                    Bank.deleteCustomer(accountNumber);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Thank you for banking with us");}
            }
        }
    }

//    private static void createNewAccount(Scanner input) {
//        System.out.println("Enter firstname:");
//        String firstName = input.nextLine();
//        System.out.println("Enter lastname:");
//        String lastName = input.nextLine();
//        System.out.println("Enter phone number:");
//        String phoneNumber = input.nextLine();
//        System.out.println("Enter initial amount to deposit:");
//        int deposit = input.nextInt();
//        Bank.createCustomer(firstName,lastName,phoneNumber,deposit);
//        System.out.println("Account created successfully");
//    }
}