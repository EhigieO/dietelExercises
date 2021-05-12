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

}
