package assignmentStore;

import bankapp.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CounterSalesRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Receipt> invoice = new ArrayList<>();
        int totalPriceOfAllItems = 0;
        int totalPricePerItem;
        int pricePerItem;
        String itemName;
        int numberOfItems;
        int proceed = 1;
        System.out.println("Your one stop shop");
        do {
            System.out.println("Enter Item name:");
            itemName = scanner.next();

            System.out.println("Enter the price per item:");
            pricePerItem = scanner.nextInt();

            System.out.println("Enter number of items bought:");
            numberOfItems = scanner.nextInt();

            totalPricePerItem = numberOfItems * pricePerItem;

            invoice.add(new Receipt(itemName,numberOfItems,pricePerItem,totalPricePerItem));

            String message = """
                    1. For more purchase
                    2. To print receipt
                    """;
            totalPriceOfAllItems += totalPricePerItem;
            System.out.println(message);
            proceed = scanner.nextInt();
        } while (proceed == 1);


        System.out.println("Item(s)   Quantity   Price   Cost");
        for (int i = 0; i < invoice.size(); i++){
        System.out.println(invoice.get(i));
        }
        System.out.print("                     Total:    ");
        System.out.println(totalPriceOfAllItems);
    }

}
