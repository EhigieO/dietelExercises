import chapterThreeExercises.HeartRates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import chapterThreeExercises.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
your heart rate stays within a safe range suggested by your trainers and doctors. According to the American
Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), the
formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
and gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes for
the month, day and year of birth). Your class should have a constructor that receives this data as parameters.
For each attribute provide set and get methods. The class also should include a method that
calculates and returns the person’s age (in years), a method that calculates and returns the person’s
maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
Java app that prompts for the person’s information, instantiates an object of class HeartRates and
prints the information from that object—including the person’s first name, last name and date of
birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
range.*/

public class HeartRatesTest {
    private HeartRates heartRates;
    @BeforeEach
    void start_Each_With(){
        heartRates = new HeartRates("Ehigie","Ikpea",new Date(7,26,2010));
    }
    @Test
    void test_That_HeartRate_Can_Set_firstName(){
        heartRates.setFirstName("Ehigie");
        assertEquals("Ehigie",heartRates.getFirstName());
    }
    @Test
    void test_That_HeartRates_Can_Set_LastName(){
        heartRates.setLastName("Ikpea");
        assertEquals("Ikpea",heartRates.getLastName());
    }
    @Test
    void testThatHeartRateCanGetAge(){
        assertEquals(11,heartRates.getAge());
    }
    @Test
    void testThatHeartRateCanCheckAndReturnMaximumRate(){
        assertEquals(209,heartRates.maximumRate());
    }
    @Test
    void testThatHeartRateCalculatorCanCheckTargetHeartRange(){
        heartRates.targetHeartRange();
    }
}