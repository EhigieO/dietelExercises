package BankApplication;

import java.util.Scanner;

public class BankInnovate {
    public static void main(String[] args) {
        System.out.println("##################################\n#    Welcome To Bank Innovate    #\n##################################");

        String prompt = """
                1) Staff Login
                2) Customer
                3) Exit app
                """;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.print("UserName: ");
                String UserName = input.next();
                System.out.print("Password: ");
                String password = input.next();
                if (UserName = BankStaff.getUserName
        }
    }
}
