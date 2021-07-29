package counterInvoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cart {
    List<Item> items = new ArrayList<>();

    public List<Item> displayItems() {
       return items;
    }

    public void addItem(Item salesBoy) {
        items.add(salesBoy);
    }

}
