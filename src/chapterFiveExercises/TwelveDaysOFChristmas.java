package chapterFiveExercises;

import java.util.Scanner;

public class TwelveDaysOFChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TWELVE DAYS OF CHRISTMAS CAROL");
        for (int day = 0; day <= 12; day = input.nextInt()) {

            switch (day) {
                case 1:
                    System.out.print("On the first");
                    break;
                case 2:
                    System.out.print("On the second");
                    break;
                case 3:
                    System.out.print("On the third");
                    break;
                case 4:
                    System.out.print("On the fourth");
                    break;
                case 5:
                    System.out.print("On the fifth");
                    break;
                case 6:
                    System.out.print("On the sixth");
                    break;
                case 7:
                    System.out.print("On the seventh");
                    break;
                case 8:
                    System.out.print("On the eighth");
                    break;
                case 9:
                    System.out.print("On the ninth");
                    break;
                case 10:
                    System.out.print("On the tenth");
                    break;
                case 11:
                    System.out.print("On the eleventh");
                    break;
                case 12:
                    System.out.print("On the twelfth");
            }
            if (day > 0) {
                System.out.println(" day of Christmas my true love sent to me");
            }
            switch (day) {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords a leaping,");
                case 9:
                    System.out.println("Nine ladies dancing,");
                case 8:
                    System.out.println("Eight maids a milking,");
                case 7:
                    System.out.println("Seven swans a swimming,");
                case 6:
                    System.out.println("Six geese a laying,");
                case 5:
                    System.out.println("Five golden rings,");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("Three French hens,");
                case 2:
                    System.out.println("Two turtle doves, and");
                case 1:
                    System.out.println("A partridge in a pear tree.");
                    System.out.println("Enter 13 to end carol");
            }
        }
    }
}
