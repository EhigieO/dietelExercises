package Estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;
    @BeforeEach
    void setUp() {
        customer = new Customer();
    }

    @Test
    void customerCanHaveMultipleBillingInformation() {
        long phoneNumber = +2347039410420L;
        String name = "Ikpea Ehigie";
        String address = ("No 312, Herbert Macaulay way,Yaba Lagos");
        int [] creditCardNumber = {4,3,8,8,5,7,6,1,8,4,0,2,6,2,6};
        customer.setBillingInfo(+2347039410420L,name,address,creditCardNumber);
        customer.setBillingInfo(+2347039410420L,name,address,creditCardNumber);
        assertEquals(2,customer.getBillingInfo());
    }
    @Test
    void customerCanDisplayBillingDetails(){
        long phoneNumber = +2347039410420L;
        String name = "Ikpea Ehigie";
        String address = ("No 312, Herbert Macaulay way,Yaba Lagos");
        int [] creditCardNumber = {4,3,8,8,5,7,6,1,8,4,0,2,6,2,6};
        customer.setBillingInfo(+2347039410420L,name,address,creditCardNumber);
        customer.setBillingInfo(+2347039410420L,name,address,creditCardNumber);
        assertEquals(2,customer.getBillingInfo());
        customer.displayBillingInfo();
    }
//    @Test
//    void cu
}