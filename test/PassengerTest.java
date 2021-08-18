import org.junit.jupiter.api.Test;
import rideHailing.Passenger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {
    @Test
    void test_That_Passenger_Can_Set_UserName() {
        Passenger passenger = new Passenger();
        passenger.setUserName("Segun");
        assertEquals("Segun",passenger.getUserName());
    }
    @Test
    void test_That_Passenger_Can_Set_Password(){
        Passenger passenger = new Passenger();
        passenger.setPassword("8956");
        assertEquals("8956", passenger.getPassword());
    }
    @Test
    void test_That_Passenger_Can_Set_UserId(){
        Passenger passenger = new Passenger();
        passenger.setUserId("CV12345");
        assertEquals("CV12345", passenger.getUserId());
    }
}
