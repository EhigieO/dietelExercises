import ecommerce.PaymentDetails;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentDetailsTest {
    @Test
    void test_That_PaymentDetails_Can_Set_CardName() {
        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setCardName("Ikpea Ehigie");
        assertEquals("Ikpea Ehigie", paymentDetails.getCardName());
    }
    @Test
    void test_That_PaymentDetails_Can_Set_CardNumber(){
        PaymentDetails  paymentDetails = new PaymentDetails();
        paymentDetails.setCardNumber("4552558430");
        assertEquals("4552558430",paymentDetails.getCardNumber());
    }
    @Test
    void test_That_PaymentDetails_Can_Set_CardType(){
        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setCardType("Visa Card");
        assertEquals("Visa Card", paymentDetails.getCardType());
    }
    @Test
    void test_That_PaymentDetails_Can_Set_Cvv(){
        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setCvv("124");
        assertEquals(124, paymentDetails.getCvv());
    }
    @Test
    void test_That_PaymentDetails_can_Set_ExpirationDate(){
        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setExpirationDate("21/05/2023");
        assertEquals("21/05/2023", paymentDetails.getExpirationDate());
    }
}
