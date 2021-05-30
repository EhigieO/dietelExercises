package chapterThreeExercises;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    private double invoiceAmount;


    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity < 1){
            this.quantity = 0;
        }else {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 1) {
            this.pricePerItem = 0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void invoiceAmount() {
        double invoiceAmount = pricePerItem * quantity;
        this.invoiceAmount = invoiceAmount;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }
}