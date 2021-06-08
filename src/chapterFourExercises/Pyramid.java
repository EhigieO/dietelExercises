package chapterFourExercises;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        System.out.println("Enter a number for pyramid size");
        userInput = input.nextInt();
        for (int outerCount = 1;outerCount <= userInput; outerCount++){

            for (int spacer = 1; spacer <= userInput - outerCount; spacer++){
                System.out.printf("%4s", " ");
            }
            for (int decrement = outerCount; decrement >= 2; decrement--){
                System.out.printf("%4d", decrement);
            }
            for (int increment = 1; increment <= outerCount; increment++){
                System.out.printf("%4d", increment);
            }
            System.out.println();
        }
    }
}
