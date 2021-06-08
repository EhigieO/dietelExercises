package chapterFiveExercises;
import java.util.Scanner;

public class IncreasingOrderFactors {
    public static void main(String[] args) {
        //factor();
        pyramid();
    }
    public static void factor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to find it's factor:");
        int number = input.nextInt();
        int factor = 2;
        while (number / factor != 1) {
            if (number % factor == 0) {
                System.out.print(factor + ", ");
                number /= factor;

            } else
                factor++;
        }
        System.out.println(number + " .");
    }
    public static void pyramid(){

          }
}
