package Estore;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Users{
    private List<BillingInformation> billingInfoList = new ArrayList<>();

    public void setBillingInfo(long phoneNumber, String name, String address, int[] creditCardNumber) {
        BillingInformation billingInfo = new BillingInformation(phoneNumber,name,address,creditCardNumber);
        billingInfoList.add(billingInfo);
    }

    public int getBillingInfo() {
        return billingInfoList.size();
    }

    public void displayBillingInfo() {
        System.out.println(billingInfoList);
    }
}
