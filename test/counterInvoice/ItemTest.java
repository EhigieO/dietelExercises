package counterInvoice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
        Item salesBoy;
        ShopSales shopSales;
        Cart cart = new Cart();
    @BeforeEach
    void setUp() {
        salesBoy = new Item();
    }
    @Test
    void testThatItemCanTakeName(){
        String itemName = "cornFlakes";
        salesBoy.setName(itemName);
        assertEquals("cornFlakes",salesBoy.getName());
    }
    @Test
    void testThatItemCanTakePrice(){
        double itemPrice = 200.0;
        salesBoy.setPricePerItem(itemPrice);
        assertEquals(200,salesBoy.getItemPrice());
    }
    @Test
    void testThatItemCanTakeNumberOfItems(){
        int numberOfItem = 10;
        salesBoy.setNumberOfItems(numberOfItem);
        assertEquals(10,salesBoy.getNumberOfItem());
    }
    @Test
    void testThatCartCanStoreItems(){
        String itemName = "cornFlakes";
        double price = 200.0;
        int quantity = 10;
        salesBoy = new Item(itemName,price,quantity);
        assertNotNull(salesBoy);
    }
    @Test
    void testThatCartHasListOfItems(){
        String itemName = "cornFlakes";
        double price = 200.0;
        int quantity = 10;
        salesBoy = new Item(itemName,price,quantity);
        cart.addItem(salesBoy);
        System.out.println(cart.getItems());
    }
}