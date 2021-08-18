package chapterFourExercises;
/*(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item Value
1 239.99
2 129.75
3 99.95
4 350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.*/

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        double end;
        double commission;
        double sales = 0;
        int selector;

        do {
            String items = """
                    Select items sold last week
                    For toilet rolls select 1
                    For soap select 2
                    For pampers select 3
                    For perfumes select 4
                    """;
            System.out.println(items);
            Scanner input = new Scanner(System.in);
            selector = input.nextInt();
            if (selector == 1) {
                sales = sales + item1;
            }
            if (selector == 2) {
                sales = sales + item2;
            }
            if (selector == 3) {
                sales = sales + item3;
            }
            if (selector == 4) {
                sales = sales + item4;
            }
            System.out.println("To end enter 1 or enter 2 to continue");
            end = input.nextInt();
        }while (end != 1);

       commission = 200 + (0.09 * sales);
        System.out.printf("Salesperson Earnings is %.2f",commission);
        }
    }
