package chapterThreeExercises;

import java.util.Scanner;

public class AccountApplication {
    public static void main(String[] args) {

        Account account = new Account("Ehigie",0.00);
        int amount;
       int input;
        do {
        String prompt = """
                Select 1 to deposit
                select 2 to withdraw
                select 3 to exit
                """;
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Enter amount to deposit");
                    amount = scanner.nextInt();
                    account.deposit(amount);
                    System.out.println("Account balance is " + account.getBalance());
                }
                case 2 -> {
                    System.out.println("Enter amount to withdraw");
                    amount = scanner.nextInt();
                    account.withdraw(amount);
                    System.out.println("Account balance is " + account.getBalance());
                }
                default -> System.out.println("Enter a valid value");
            }

        } while (input != 3) ;
    }
}