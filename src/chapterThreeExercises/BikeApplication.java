package chapterThreeExercises;

import java.util.Scanner;

public class BikeApplication {
    public static void main(String[] args) {
        Bike okada = new Bike();
        int userInput;
        do {
        String prompt = """
                Enter 1 for Turn on
                Enter 2 for Accelerate
                Enter 3 for Decelerate
                Enter 4 to Turn Off / Exit Application                
                """;
        Scanner inputCollector = new Scanner(System.in);
        System.out.println(prompt);
        userInput = inputCollector.nextInt();
        switch (userInput) {
            case 1:
                okada.setOn(true);
                System.out.println("Bike is On");
                break;
            case 2:
                okada.speedUp();
                System.out.println("Bike is On");
                System.out.println("Current Speed" + okada.getSpeedInKmPerHour());
                System.out.println("Current gear" + okada.getCurrentGearNumber());
                break;
            case 3:
                okada.slowDown();
                System.out.println("Bike is on");
                System.out.println("Current speed" + okada.getSpeedInKmPerHour());
                System.out.println("Current gear" + okada.getCurrentGearNumber());
                break;
            case 4:
                okada.setOn(false);
                break;
        }
        }while (userInput != 4);

    }
}
