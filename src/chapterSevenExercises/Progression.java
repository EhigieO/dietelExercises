package chapterSevenExercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int selection = 0;
        while (selection != 1 && selection != 2) {
            try {
                selection = input(userInput);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        }
        System.out.println("Enter series of three numbers:");
        int numberOne = userInput.nextInt();
        int numberTwo = userInput.nextInt();
        int numberThree = userInput.nextInt();
        if (selection == 1){
            System.out.println(arithmetic(numberOne,numberTwo,numberThree));
        }else
            if (selection == 2){
                System.out.println(geometric(numberOne,numberTwo,numberThree));
            }
    }

    private static int input(Scanner userInput) {
        System.out.println("Enter 1 for ARITHMETIC PROGRESSION");
        System.out.println("Enter 2 for GEOMETRIC PROGRESSION");
        int selection = userInput.nextInt();
        if (selection > 2) throw new IllegalArgumentException("Enter a valid selection");
        return selection;
    }

    public static int difference(int numberOne, int numberTwo) {
        return Math.max(numberOne,numberTwo) - Math.min(numberOne,numberTwo);
    }

    public static int ratio(int numberOne, int numberTwo) {
        return Math.max(numberOne,numberTwo) / Math.min(numberOne,numberTwo);
    }

    public static boolean isSame(int differenceOne, int differenceTwo) {
        return differenceOne == differenceTwo;
    }

    public static int arithmetic(int numberOne, int numberTwo, int numberThree) {
        int numberFour = 0;
        int differenceOne = difference(numberOne, numberTwo);
        int differenceTwo = difference(numberTwo,numberThree);
        if (isSame(differenceOne,differenceTwo)){
            if (numberOne > numberTwo){
            numberFour = numberThree - differenceOne;}else
                numberFour = numberThree + differenceOne;
        }
        return numberFour;
    }

    public static int geometric(int numberOne, int numberTwo, int numberThree) {
        int numberFour = 0;
        int ratioOne = ratio(numberOne,numberTwo);
        int ratioTwo = ratio(numberTwo,numberThree);
        if (isSame(ratioOne,ratioTwo)){
            if (numberOne > numberTwo){
                numberFour = numberThree / ratioOne;} else
                    numberFour = numberThree * ratioOne;
        }
        return numberFour;
    }
}
