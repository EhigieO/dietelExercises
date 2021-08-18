package chapterFiveExercises;

import java.util.Scanner;

//Bar Chart Printing Program) One interesting application of computers is to display
//graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//number that’s read, your program should display the same number of adjacent asterisks. For example,
//if your program reads the number 7, it should display *******. Display the bars of asterisks after
//you read all five numbers.
public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number;
//        for (int j = 0; j < 5; j++){
//            System.out.println("Enter number of asterisks to print:");
//            number = scanner.nextInt();
//
//            if (number >= 1 && number <= 30){
//            for (int i = 0; i <= number; i++){
//                System.out.print("*");
//            }
//        }
                Scanner sc = new Scanner(System.in);

                int[] values = new int[5];
                int count = 0;

                // get input
                for(int i=0; i<5; i++){
                    values[i] = requestInput("Enter number " + ++count + ": ", sc);
                }

                count = 0;
                // print values
                for(int i=0; i<5; i++){
                    System.out.printf("%d:  ", ++count);
                    for(int j=0; j<values[i]; j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }

            }
            public static int requestInput(String s, Scanner sc){
                System.out.print(s);
                return sc.nextInt();
            }
        }