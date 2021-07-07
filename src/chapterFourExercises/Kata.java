package chapterFourExercises;

import java.util.Arrays;
import java.util.Scanner;

import static chapterSevenExercises.MultipleArrayOperations.sumUpArrays;

public class Kata {
    public static void main(String... args) {
        palindrome();
        // testDrillerSoftware()
        //ellersProfit();
//        Kata kata = new Kata();
//        kata.reversedNumber(54231);
     //   checkClass();
    }

    public static void palindrome() {
        Scanner input = new Scanner(System.in);

        int number;
        int reversed = 0;
        System.out.println("Enter number: ");
        number = input.nextInt();
        int pal = number;

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

    public String decimalToBinary(int decimal) {
        StringBuilder binaryNumber = new StringBuilder();
        int remainder;
        while (decimal >= 1)
        {
        remainder = decimal % 2;
        if (remainder == 0){
            binaryNumber.insert(0, 0);
        }
        if (remainder > 0){
            binaryNumber.insert(0, 1);
        }
        decimal /= 2;
        }
        return binaryNumber.toString();
    }

    public String convertAnyBaseToBinary(int decimalNumber, int base) {
        int digit;
        String octalNumber = "";
        if (base < 10) {
            for (int i = 0; i < decimalNumber; i++) {
                digit = decimalNumber % base;
                decimalNumber /= base;
                octalNumber = digit + octalNumber;
            }
        }

        System.out.println(decimalNumber + octalNumber);
        return decimalNumber + octalNumber;


    }
    public static void findMaxFrom()
    {

    }

int smallestNum;
    public void findMaxNumber(int numOne, int numTwo) {
        if ( numOne > numTwo)
            smallestNum = numTwo;
        else
            smallestNum = numOne;
    }

    public int getMinNumber() {
        return smallestNum;
    }

    public int findMaxNumberFrom() {
        return 0;
    }
    static void checkClass() {
        Scanner input = new Scanner(System.in);
        int age = 0;
        while (age != 15) {
            System.out.print("How old are you:");

            age = input.nextInt();
            if (age >= 10 && age <= 30) {
                System.out.print("          ");
                System.out.println("Enter this Class");
            } else
            { System.out.print("          ");
            System.out.println("Go to the next class you bloody wimp");}
            System.out.println();
        }
    }

    public String checkStoreDay() {

        return null;
    }

    public static int maxSumArray(int[] numArray) {
        int sumArray;
        int maxArray;
        int maxSumArray = 0;
        sumArray = (int) sumUpArrays(numArray);

        for (int i = 0;i < numArray.length;i++){
            maxArray = sumArray - numArray[i];
           maxSumArray = Math.max(maxArray ,maxSumArray);
            }
         return maxSumArray;
        }

    public static int minSumArray(int[] numArray) {
        int minArray;
        int sumMinArray = Integer.MAX_VALUE;
        for (int i = 0;i < numArray.length;i++){
            minArray = ((int) sumUpArrays(numArray)) - numArray[i];
            sumMinArray = Math.min(sumMinArray,minArray);
        }
        return sumMinArray;
    }
}


