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
        Long CreditCardNumber = 438857618402626L;
        customer.setBillingInfo();
    }
}