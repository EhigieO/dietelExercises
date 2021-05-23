import chapterThreeExercises.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private Television television;

    @BeforeEach
    void each_Test_Should_Start_With(){ television = new Television(); }
    @Test
    void test_That_Tv_Can_Get_Name(){
        assertEquals("Samsung",television.getName());
    }
    @Test
    void test_That_Television_Can_Set_On() {
        television.setOn(true);
        assertTrue(television.isOn());
    }
    @Test
    void test_That_Tv_Can_Set_Channel(){
        television.setOn(true);
        television.setChannel(10);
        assertEquals(10,television.getChannel());
    }
    @Test
    void test_That_Tv_Can_Next_Channel(){
        television.setOn(true);
        television.nextChannel();
        assertEquals(2,television.getChannel());
        television.setChannel(40);
        television.nextChannel();
        television.nextChannel();
        assertEquals(42,television.getChannel());
    }
    @Test
    void test_That_Tv_Can_Previous_Channel(){
        television.setOn(true);
        television.setChannel(15);
        television.previousChannel();
        assertEquals(14,television.getChannel());
    }
    @Test
    void test_That_Tv_Can_Set_Volume(){
        television.setOn(true);
        television.setVolume(20);
        assertEquals(20,television.getVolume());
    }
    @Test
    void test_That_Tv_Can_Increase_Volume(){
        television.setOn(true);
        television.setVolume(95);
        television.increaseVolume();//increase volume by 5
        assertEquals(100,television.getVolume());
    }
    @Test
    void test_That_Tv_Can_Decrease_Volume(){
        television.setOn(true);
        television.setVolume(30);
        television.decreaseVolume();//decrease volume by 5
        assertEquals(25,television.getVolume());
    }
    @Test
    void test_That_Tv_Can_Be_Set_Off(){
        television.setOn(false);
        assertFalse(television.isOn());
    }
    @Test
    void test_That_Tv_Cannot_Change_Volume_When_Off(){
        television.setOn(false);
        television.setVolume(20);
        television.increaseVolume();
        assertEquals(0,television.getVolume());
        television.decreaseVolume();
        assertEquals(0,television.getVolume());
    }
    @Test
    void test_That_Tv_Cannot_Change_Channel_When_Off(){
        television.setOn(false);
        television.setChannel(10);
        television.nextChannel();
        assertEquals(1,television.getChannel());
    }
    @Test
    void test_That_Tv_Is_Set_To_Last_Set_Conditions(){
        television.setOn(true);
        assertEquals(1,television.getChannel());
        television.setChannel(10);
        television.setVolume(20);
        television.setOn(false);
        assertEquals(0,television.getChannel());
    }
    @Test
    void test_That_tv_volume_Cannot_Exceed_OneHundred(){
        television.setOn(true);
        television.setVolume(50);
        television.setVolume(101);
       assertEquals(50, television.getVolume());
    }
    @Test
    void test_That_Tv_Channel_Cannot_Exceed_Fifty_Or_Fall_Below_One(){
        television.setOn(true);
        television.setChannel(40);
        television.setChannel(51);
        television.setChannel(0);
        assertEquals(40, television.getChannel());
    }
}
