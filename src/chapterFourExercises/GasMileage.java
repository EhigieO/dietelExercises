package chapterFourExercises;

import java.util.Scanner;

public class GasMileage {
    /*Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user.*/
    public static void main(String[] args) {
        int miles;
        int gallons;
        double milesPerGallon;
        double totalMilesPerGallon;
        int totalMiles = 0;
        int totalGallons = 0;
        int stopper = 1;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("Enter Miles driven:");
            miles = scanner.nextInt();

            System.out.print("Enter gallons used:");
            gallons = scanner.nextInt();

            milesPerGallon = miles / gallons;
            System.out.println("Miles per gallon for this trip is " + milesPerGallon);

            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;
            totalMilesPerGallon = totalMiles / totalGallons;
            System.out.println("Miles per gallon for all trip(s) is " + totalMilesPerGallon);
            System.out.print("Press 0 to end or 2 to continue.");
            stopper = scanner.nextInt();
        }
        while (stopper != 0);
    }
}
