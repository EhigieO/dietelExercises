package counterInvoice;

public class Item {

    private String itemName;
    private double itemPrice;
    private int quantity;
    private double costOfItems;

    public Item(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }
    public Item(){

    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public String getName() {
        return itemName;
    }

    public void setPricePerItem(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        return String.format("%d %15s %10.2f", quantity,itemName,itemPrice);
    }

    public void setNumberOfItems(int numberOfItem) {
        this.quantity = numberOfItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCostOfItems() {
        return costOfItems;
    }
}
