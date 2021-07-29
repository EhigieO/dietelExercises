package counterInvoice;

import assignmentStore.Receipt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopSales {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        int totalQuantity = 0;
        int quantity;
        int price;
        String itemName;
        int proceed = 1;
        System.out.println("Your one stop shop");
        do {
            System.out.println("Enter Item name:");
            itemName = scanner.next();

            System.out.println("Enter the price per item:");
            price = scanner.nextInt();

            System.out.println("Enter number of items bought:");
            quantity = scanner.nextInt();

            Item item = new Item(itemName,price,quantity);
            cart.addItem(item);
            totalQuantity += price*quantity;

            String message = """
                    1. For more purchase
                    2. To print receipt
                    """;
            System.out.println(message);
            proceed = scanner.nextInt();
        } while (proceed == 1);
        displayInvoice();
    }

    private static void displayInvoice(Cart itemCart) {
        Cart items = itemCart;
        System.out.printf("%30s\n", "RECEIPT");
        System.out.println("Number of Items\tItem\tPrice\tQuantity\tTotal");
        for (int i = 0; i < items.displayItems().size();i++) {
            Item item = items.displayItems().get(i);
            String itemName =
        }
    }
}
