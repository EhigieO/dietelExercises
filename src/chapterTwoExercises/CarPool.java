package chapterTwoExercises;

import java.util.Scanner;
    public class CarPool {
        public static void main(String... args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter total miles driven per day: ");
            int totalMiles = input.nextInt();

            System.out.println("Enter cost per gallon: ");
            int gasolineCost = input.nextInt();

            System.out.println("Enter average miles per gallon: ");
            int averageMiles = input.nextInt();

            System.out.println("Enter parking fees per day: ");
            int parkingFees = input.nextInt();

            System.out.println("Enter tolls per day: ");
            int tolls = input.nextInt();

            int costOfDriving = (totalMiles / averageMiles) * gasolineCost + parkingFees + tolls;

            System.out.println("Your Daily Driving Cost Is: " + costOfDriving);
        }
    }
