package chapterSixExercises;

import java.util.Scanner;

public class DisplayingSquareAndCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        char letter;

        System.out.println("Enter number:");
        number = input.nextInt();

        System.out.println("Enter char letter");
        letter = input.next().charAt(0);

        for (int i = 0;i < number;i++){
            for (int j = 0;j < number;j++){
                System.out.print(letter);
                System.out.print(" ");
            }
            System.out.println();
        }
       // shapesAndSides(5,'H');
    }
    static void shapesAndSides(int number, char letter){
        for (int i = 0;i < number;i++){
            for (int j = 0;j < number;j++){
                System.out.print(letter);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
