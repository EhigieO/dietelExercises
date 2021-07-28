package Estore;

import java.util.Arrays;

public class BillingInformation {
    private long phoneNumber;
    private String name;
    private String address;
    private int [] creditCard;

    public BillingInformation(long phoneNumber, String name, String address, int[] creditCard) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "BillingInformation{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", creditCard=" + Arrays.toString(creditCard) +
                "}\n";
    }
}
