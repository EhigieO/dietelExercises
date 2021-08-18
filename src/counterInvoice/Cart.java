package counterInvoice;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
       return items;
    }

    public void addItem(Item salesBoy) {
        items.add(salesBoy);
    }
    public void displayInvoice(){
        System.out.println("*******************RECEIPT*******************");
        System.out.printf("%s%8s%10s%10s\n","Quantity","Item","Price","Total");
        Cart itemCart = null;
        for (int i = 0; i < itemCart.getItems().size(); i++) {
            Item item = itemCart.getItems().get(i);
            int quantity = item.getQuantity();
            String name = item.getName();
            double price = item.getItemPrice();
            System.out.printf("%d%12s%12.2f%15.2f%n",quantity,name,price,(price * quantity));
        }
    }
}
