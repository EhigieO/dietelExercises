package counterInvoice;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class ShopSales {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        int quantity;
        int price;
        String itemName;
        int proceed = 1;
        System.out.println("Your one stop shop");
        do {

            System.out.println("Enter Item name:");
            itemName = scanner.next();
            try {
                System.out.println("Enter the price per item:");
                price = scanner.nextInt();
                if (price < 1){
                    throw new InvalidParameterException("Enter a valid price");
                }

                System.out.println("Enter number of items bought:");
                quantity = scanner.nextInt();
                if (quantity < 1){
                    throw new InvalidParameterException("Enter a valid quantity");
                }
                Item item = new Item(itemName, price, quantity);
                cart.addItem(item);
                totalPrice += price * quantity;
            } catch (InvalidParameterException error) {
                System.out.println(error.getMessage());
            }
            try {
            String message = """
                    1. For more purchase
                    2. To print receipt
                    """;
            System.out.println(message);

                proceed = scanner.nextInt();
                if (proceed != 1 && proceed != 2){
                    throw new IllegalArgumentException("Select a valid option");
                }
            }catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        } while (proceed == 1);
        displayInvoice(cart);
        System.out.printf("%35.2f\t",totalPrice);
    }

    private static void displayInvoice(Cart itemCart) {
        System.out.println("*******************RECEIPT*******************");
        System.out.printf("%s %8s %10s %10s\n","Quantity","Item","Price","total");
        for (int i = 0; i < itemCart.displayItems().size(); i++) {
            Item item = itemCart.displayItems().get(i);
            int quantity = item.getNumberOfItem();
            String name = item.getName();
            double price = item.getItemPrice();
            System.out.printf("%d %8s %10.2f%n",quantity,name,price);
        }
    }
}
