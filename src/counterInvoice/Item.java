package counterInvoice;

public class Item {

    private String itemName;
    private double itemPrice;
    private int numberOfItem;
    private double costOfItems;

    public Item(String itemName, double itemPrice, int numberOfItem) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.numberOfItem = numberOfItem;
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
        return String.format("%d %15s %10.2f",numberOfItem,itemName,itemPrice);
    }

    public void setNumberOfItems(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }

    public double getCostOfItems() {
        return costOfItems;
    }
}
