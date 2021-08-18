import chapterThreeExercises.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {
    private Date date;
    @BeforeEach
    void start_Each_With(){
        date = new Date(1,1,1900);
    }

    @Test
    void test_That_Month_Cannot_Set_Above_December() {
        date.setMonth(14);
        assertEquals(1,date.getMonth());}
    @Test
    void test_That_Day_Can_Set(){
        date.setDay(31);
        date.setMonth(3);
        date.setYear(2000);
        assertEquals(31,date.getDay());
    }
    @Test
    void test_That_Year_Cannot_Set_Above_FiveThousand(){
        date.setYear(8004);
        assertEquals( 1900,date.getYear());
    }
    @Test
    void test_That_Year_Can_Set(){
        date.setYear(2008);
        assertEquals(2008,date.getYear());
    }
    @Test
    void test_That_Date_Set(){
        date.setMonth(2);
        date.setDay(28);
        date.setYear(2000);
        date.displayDate();
       assertEquals("2/28/2000",date.displayDate());
    }
    @Test
    void test_To_Assert_Default_Values(){
        assertEquals(1,date.getDay());
        assertEquals(1,date.getMonth());
       assertEquals(1900, date.getYear());
    }
}
