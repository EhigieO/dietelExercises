package chapterFourExercises;

import java.awt.*;
import java.util.Scanner;

public class Banking {;
    public static void main(String[] args) {
        // banking();
        switchCase();
    }

    public static void banking() {

        int number = 0;
        Scanner scan = new Scanner(System.in);
        while (number != 6) {
            System.out.printf(" Enter 1 for deposit %n Enter 2 for withdraw %n Enter 3 to view All account %n " +
                    "Enter 4 to transfer %n Enter 5 to view your details %n Enter 6 to exit %n Enter 7 to logout %n ");
            number = scan.nextInt();
            if (number == 1) {
                System.out.println("Deposit");
            } else if (number == 2) {
                System.out.println("Withdraw");
            } else if (number == 3) {
                System.out.println("Account");
            } else if (number == 4) {
                System.out.println("Transfer");
            } else if (number == 5) {
                System.out.println("Details");
            } else if (number == 7) {
                System.out.println("Logout");
            } else if (number < 1 || number > 7) {
                System.out.println("invalid number enter a valid number");
            }
        }
    }

    public static void switchCase() {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        do {
            String numberPrompt = """
                    Enter 1 for deposit
                    Enter 2 for withdraw
                    Enter 3 to view All account
                    Enter 4 to transfer
                    Enter 5 to view your details
                    Enter 6 to exit
                    Enter 7 to logout
                    """;
            System.out.print(numberPrompt);

            number = scan.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Deposit");
                    break;
                case 2:
                    System.out.println("Withdraw");
                    break;
                case 3:
                    System.out.println("Account");
                    break;
                case 4:
                    System.out.println("Transfer");
                    break;
                case 5:
                    System.out.println("Details");
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                case 7:
                    System.out.println("logout");
                    break;
                default:
                    System.out.println("invalid number enter a valid number");
            }
        }
        while (number != 6);
    }
}