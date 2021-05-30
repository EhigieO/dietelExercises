import chapterThreeExercises.Invoice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    private Invoice invoice;
    @BeforeEach
    void start_Each_With(){
        invoice = new Invoice("avc234","Stabilizer", 0,8000.00);
    }
    @Test
    void test_That_Invoice_Set_Part_Number() {
        invoice.setPartNumber("AC2001");
        assertEquals("AC2001",invoice.getPartNumber());
    }
    @Test
    void test_That_Invoice_Can_Set_Part_Description(){
        invoice.setPartDescription("Air Conditioner");
        assertEquals("Air Conditioner",invoice.getPartDescription());
    }
    @Test
    void test_That_Invoice_Can_Set_Quantity(){
        invoice.setQuantity(30);
        assertEquals(30,invoice.getQuantity());
    }
    @Test
    void test_That_Invoice_Can_Set_PricePerItem(){
        invoice.setPricePerItem(5000.00);
        assertEquals(5000.00,invoice.getPricePerItem());
    }
    @Test
    void test_That_Invoice_Can_Calculate_Total_PriceOfItems(){
        invoice.setPricePerItem(5000);
        invoice.setQuantity(80);
        invoice.invoiceAmount();
        assertEquals(400000,invoice.getInvoiceAmount());
    }
    @Test
    void test_To_Assert_The_Defaults(){
        assertEquals(8000,invoice.getPricePerItem());
        assertEquals(0,invoice.getQuantity());
        assertEquals(0.0,invoice.getInvoiceAmount());
    }
    @Test
    void test_Boundaries_Of_Quantity(){
        invoice.setQuantity(-5);
        assertEquals(0,invoice.getQuantity());
    }
    @Test
    void test_Boundaries_Of_PricePerItem(){
        invoice.setPricePerItem(-1);
        assertEquals(0.0,invoice.getPricePerItem());
    }
}
