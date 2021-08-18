package chapterFiveExercises;

import java.util.Scanner;

public class HighestNameScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudent;
        int count = 1;
        String name;
        int score;
        int highestScore = 0;
        String studentWithHighScore = "";

        System.out.println("Enter number of students");
        numberOfStudent = scanner.nextInt();

        while (count <= numberOfStudent) {
            count++;
            System.out.println("Enter name of student:");
            name = scanner.next();

            System.out.println("Enter the score of student:");
            score = scanner.nextInt();
            if (highestScore < score) {
                highestScore = score;
                studentWithHighScore = name;
            }
            System.out.printf("%s %d%n", name, score);
        }

        System.out.printf("Student with the highest score is %s with score %d",studentWithHighScore,highestScore);
    }
}