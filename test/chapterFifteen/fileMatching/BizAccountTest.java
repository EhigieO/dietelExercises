package chapterFifteen.fileMatching;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Formatter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BizAccountTest {
    BizAccount account;
    TransactionRecord transrec;
    Formatter formatter;
    FileMatch filesMatch;

    @BeforeEach
    void setUp() {
        account = new BizAccount();

    }
    @Test
    void notnull(){
        assertNotNull(account);
    }
    @Test
    void account_Has_FirstName(){
        account.setFirstName("Ehigie");
        assertEquals("Ehigie",account.getFirstname());
    }
    @Test
    void account_Has_LastName(){
        account.setLastName("Ikpea");
        assertEquals("Ikpea",account.getLastName());
    }
    @Test
    void account_Has_Balance(){
        double amount = 0;
        account.setBalance(amount);
        assertEquals(0.00,account.getBalance());
    }
    @Test
    void transaction_Record_Has_Account_number(){
        transrec = new TransactionRecord();
        int accountNumber = 100;
        transrec.setAccountNumber(accountNumber);
        assertEquals(100,transrec.getAccountNumber());
    }
    @Test
    void transaction_Record_Amount(){
        transrec = new TransactionRecord();
        int transactionAmount = 100;
        transrec.setTransAmount(transactionAmount);
        assertEquals(100, transrec.getTransAmount());
    }
    @Test
    void account_Can_Combine(){
        transrec = new TransactionRecord();
        account.setAccountNumber(1000);
        transrec.setAccountNumber(1000);
        assertEquals(account.getAccountNumber(),transrec.getAccountNumber());
        transrec.setTransAmount(200);
        account.setBalance(100.00);
        account.combine(transrec);
        assertEquals(300.00,account.getBalance());
    }
    @Test
    void account_Has_Number(){
        account.setAccountNumber(1000);
        assertEquals(1000,account.getAccountNumber());
    }
    @Test
    void Old_Master_File_Exist(){
        try {
            formatter = new Formatter("oldmast.txt");
            formatter.close();
        } catch (IOException ex){
            System.out.println("File could not be created");
        }
        Path path = Paths.get("oldmast.txt");
        assertTrue(Files.exists(path));
    }
    @Test
    void oldMast_File_Not_empty(){
        Scanner scan = null;

        String oldmastContent = "100 Alan Jones 348.17\n300 Mary Smith 27.19\n500 Sam Sharp 0.00\n700 Suzy Green –14.22";
             try {
                 formatter = new Formatter("oldmast.txt");
                 scan = new Scanner(Paths.get("oldmast.txt"));
             }
             catch (FileNotFoundException ex){

             }
             catch (IOException ex){

             }
             assertFalse(scan.hasNext());
            formatter.format(oldmastContent);
            assertFalse(scan.hasNext());
        formatter.close();
    }
    @Test
    void trans_File_Exist(){
        try {
            Formatter formatter = new Formatter("trans.txt");
            formatter.close();
        } catch (IOException er){
            System.out.println("file could not be created");
        }
        Path path = Paths.get("trans.txt");
        assertTrue(Files.exists(path));
    }
    @Test
    void trans_File_Not_empty(){
        Scanner scan = null;

        String logContent = "100 27.14\n300 62.11\n400 100.56\n900 82.17";
        try {
            formatter = new Formatter("trans.txt");
            scan = new Scanner(Paths.get("trans.txt"));
        }
        catch (FileNotFoundException ex){

        }
        catch (IOException ex){

        }
        assert scan != null;
        assertFalse(scan.hasNext());
        formatter.format(logContent);
        assertFalse(scan.hasNext());
        formatter.close();
    }@Test
    void newMast_File_Exist(){
        try {
            Formatter formatter = new Formatter("newMast.txt");
            formatter.close();
        } catch (IOException er){
            System.out.println("File could not be created");
        }
        Path path = Paths.get("newMast.txt");
        assertTrue(Files.exists(path));
    }
    @Test
    void log_File_Exist(){
        try {
            Formatter formatter = new Formatter("log.txt");
            formatter.close();
        } catch (IOException er){
            System.out.println("file could not be created");
        }
        Path path = Paths.get("log.txt");
        assertTrue(Files.exists(path));
    }

}