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
                String UserName = input.next();
                System.out.print("Password: ");
                String password = input.next();
                if (UserName.equals(BankStaff.getUserName()) & password.equals(BankStaff.getPin())) {
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

                    case 2:
                }
            case 3:
                System.out.println("##################################\n# Thank you for Banking with Us  #\n##################################");
        }

        }
    }
}
