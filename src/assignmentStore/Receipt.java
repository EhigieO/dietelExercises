package assignmentStore;

public class Receipt {
    public int totalPriceOfItems;
    public int pricePerItem;
    public String itemName;
    public int numberOfItems;

    public Receipt( String itemName, int numberOfItems,int pricePerItem, int  totalPriceOfItems) {
        this.totalPriceOfItems = totalPriceOfItems;
        this.pricePerItem = pricePerItem;
        this.itemName = itemName;
        this.numberOfItems = numberOfItems;
    }
    @Override
    public String toString() {
        return "%s     %d    %d    %d".formatted(itemName, numberOfItems, pricePerItem, totalPriceOfItems);
    }
}
