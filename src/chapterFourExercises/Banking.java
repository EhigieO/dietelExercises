package chapterFourExercises;

import java.awt.*;
import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
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
            }else if (number < 1 || number > 7) {
                System.out.println("invalid number enter a valid number");}

        }
    }
}