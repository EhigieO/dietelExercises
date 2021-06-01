package chapterFourExercises;

import java.util.Scanner;

public class Kata {
    public static void main(String... args) {   //palindrome();
        // testDrillerSoftware()
        //ellersProfit();
        Kata kata = new Kata();
        kata.reversedNumber(54321);
    }

    public static void palindrome() {
        Scanner input = new Scanner(System.in);

        int number;
        int reversed = 0;
        System.out.println("Enter number: ");
        number = input.nextInt();
        int pal = number + 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println(reversed);
        if (reversed == pal) {
            System.out.print("Number is a Palindrome " + reversed);
        }
    }

    public static void testDrillerSoftware() {
        Scanner scan = new Scanner(System.in);
        int copiesToBuy;
        int priceOfCopies;
        System.out.print("Enter number of copies to buy: ");
        copiesToBuy = scan.nextInt();
        if (copiesToBuy > 199) {
            priceOfCopies = copiesToBuy * 800;
        } else if (copiesToBuy > 99 && copiesToBuy < 200) {
            priceOfCopies = copiesToBuy * 900;
        } else if (copiesToBuy > 49 && copiesToBuy < 100) {
            priceOfCopies = copiesToBuy * 1000;
        } else if (copiesToBuy > 29 && copiesToBuy < 50) {
            priceOfCopies = copiesToBuy * 1100;
        } else if (copiesToBuy > 9 && copiesToBuy < 30) {
            priceOfCopies = copiesToBuy * 1200;
        } else if (copiesToBuy > 4 && copiesToBuy < 10) {
            priceOfCopies = copiesToBuy * 1400;
        } else {
            priceOfCopies = copiesToBuy * 1500;
        }

        System.out.printf("Total price of %d copy(s) is %d%n", copiesToBuy, priceOfCopies);
    }


    public static void sellersProfit() {
        int copiesToBuy;
        int profitMargin;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Copies to buy: ");
        copiesToBuy = input.nextInt();
        if (copiesToBuy > 199) {
            profitMargin = (copiesToBuy * 2000) - (copiesToBuy * 800);
        } else if (copiesToBuy > 99 && copiesToBuy < 200) {
            profitMargin = (copiesToBuy * 2000) - (copiesToBuy * 900);
        } else if (copiesToBuy > 49 && copiesToBuy < 100) {
            profitMargin = (copiesToBuy * 2000) - (copiesToBuy * 1000);
        } else if (copiesToBuy > 29 && copiesToBuy < 50) {
            profitMargin = (copiesToBuy * 2000) - (copiesToBuy * 1100);
        } else if (copiesToBuy > 9 && copiesToBuy < 30) {
            profitMargin = (copiesToBuy * 2000) - (copiesToBuy * 1200);
        } else if (copiesToBuy > 4 && copiesToBuy < 10) {
            profitMargin = (copiesToBuy * 2000) - (copiesToBuy * 1400);
        } else {
            profitMargin = (copiesToBuy * 2000) - (copiesToBuy * 1500);
        }

        System.out.printf("Total profit of %d copy(s) is %d%n", copiesToBuy, profitMargin);
    }

    public String reversedNumber(int number) {
        String reversed = "";
        for (int i = 10000; i > 0; ) {
            int digit = number / i;
            reversed = digit + reversed;
            number = number % i;
            i = i / 10;
        }
        return reversed;
    }

    public int findFactorial(int factNumber) {
        int factorial = 1;
        for (; factNumber > 0; ) {
            factorial = factorial * factNumber ;
            factNumber--;
        }
        return factorial;
    }
}
