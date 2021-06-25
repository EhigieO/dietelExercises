package BankApplication;

import java.util.Scanner;

public class BankInnovate {
    public static void main(String[] args) {
        System.out.println("##################################\n#    Welcome To Bank Innovate    #\n##################################");
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        while (userInput < 3) {

        String prompt = """
                1) Staff Login
                2) Customer
                3) Exit app
                """;
        System.out.println(prompt);
            userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.print("UserName: ");
                String userName = input.next();
                System.out.print("Password: ");
                String password = input.next();
                if (userName.equals(BankStaff.getUserName()) & password.equals(BankStaff.getPin())) {
                    String prompt1 = """
                            1) View all accounts
                            2) Delete account
                            3) Logout
                            """;
                    System.out.println(prompt1);
                }
            case 2:
                String prompt2 = """
                        1) Create account
                        2) Login
                        """;
                System.out.println(prompt2);
                switch (userInput) {
                    case 1:
                        System.out.println("Enter first name:");
                        String firstName = input.next();
                        System.out.println("Enter last name");
                        String lastName = input.next();
                        System.out.println("Enter phone number");
                        String phoneNumber = input.next();
                        System.out.println("Enter account opening amount");
                        int amount = input.nextInt();
                        Bank.createCustomer("Ehis","Sandy","07052854469",1000);
                    case 2:
                        System.out.print("UserName: ");
                        userName = input.next();
                        System.out.print("Password: ");
                        password = input.next();
                        if (userName.equals(Customer.getFirstName()) && password.equals(Customer.getPin())){
                            String prompt4 = """
                                    1) Deposit
                                    2) Withdraw
                                    3) Transfer
                                    4) Load Airtime
                                    5) Logout
                                    """;
                            System.out.println(prompt4);
                            switch (userInput){
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
                                    System.out.print("Enter account number:");
                                    int accountNumber = input.nextInt();
                                   // Customer.transfer(amount,accountNumber);
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
            case 3:
                System.out.println("##################################\n# Thank you for Banking with Us  #\n##################################");
        }

        }
    }
}
