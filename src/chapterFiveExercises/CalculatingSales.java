package chapterFiveExercises;

import java.util.Scanner;

//(Calculating Sales) An online retailer sells five products whose retail prices are as follows:
//Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
//Write an application that reads a series of pairs of numbers as follows:
//a) product number
//b) quantity sold
//Your program should use a switch statement to determine the retail price for each product. It
//should calculate and display the total retail value of all products sold. Use a sentinel-controlled
//loop to determine when the program should stop looping and display the final results.
public class CalculatingSales {
    public static void main(String[] args) {
        double productPrice = 1;
        int productNumber = 0;
        int quantitySold = 1;
        double retailPrice = 0;
        double totalRetailPrice = 0;
        while (productNumber <= 5) {
            String prompt = """
                    Select Product number
                    1. Product One $2.98
                    2. Product Two $4.50
                    3. Product Three $9.98
                    4. Product Four $4.49
                    5. Product Five $6.85
                    """;
            System.out.println(prompt);
            Scanner input = new Scanner(System.in);
            productNumber = input.nextInt();
            switch (productNumber) {
                case 1:
                    System.out.println("Enter quantity sold:");
                    quantitySold = input.nextInt();
                    productPrice = 2.98;
                    retailPrice = productPrice * quantitySold;
                    System.out.println("$" + retailPrice);
                    totalRetailPrice += retailPrice;
                    break;
                case 2:
                    System.out.println("Enter quantity sold:");
                    quantitySold = input.nextInt();
                    productPrice = 4.50;
                    retailPrice = productPrice * quantitySold;
                    System.out.println("$" + retailPrice);
                    totalRetailPrice += retailPrice;
                    break;
                case 3:
                    System.out.println("Enter quantity sold:");
                    quantitySold = input.nextInt();
                    productPrice = 9.98;
                    retailPrice = productPrice * quantitySold;
                    System.out.println("$" + retailPrice);
                    totalRetailPrice += retailPrice;
                    break;
                case 4:
                    System.out.println("Enter quantity sold:");
                    quantitySold = input.nextInt();
                    productPrice = 4.49;
                    retailPrice = productPrice * quantitySold;
                    System.out.println("$" + retailPrice);
                    totalRetailPrice += retailPrice;
                    break;
                case 5:
                    System.out.println("Enter quantity sold:");
                    quantitySold = input.nextInt();
                    productPrice = 6.85;
                    retailPrice = productPrice * quantitySold;
                    System.out.println("$" + retailPrice);
                    totalRetailPrice += retailPrice;
                    break;
                default:

                    System.out.println("Total: $" + totalRetailPrice);
            }
        }
    }
}
