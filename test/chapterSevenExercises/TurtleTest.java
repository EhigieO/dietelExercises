package chapterSevenExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleChapSeven.Direction;
import turtleChapSeven.Pen;
import turtleChapSeven.Turtle;

import static turtleChapSeven.Position.DOWN;
import static org.junit.jupiter.api.Assertions.*;
import static turtleChapSeven.Position.Up;

class TurtleTest {
Turtle ijapa;
Pen biro;
    @BeforeEach
    void setUp() {
        ijapa = new Turtle();
        biro = new Pen();
    }
    @Test
    void turtleCanBeConstructed(){
        assertNotNull(ijapa);
    }
    @Test
    void turtleHasAPenTest(){
        ijapa.setPen(biro);
       assertSame(biro,ijapa.getPen());
    }
    @Test
    void turtleHasPenOnCreation(){
        assertNotNull(ijapa.getPen());
    }
    @Test
    void turtleCanChangePenTest(){
        ijapa.setPen(biro);
        assertSame(biro,ijapa.getPen());
    }
    @Test
    void turtleCanTurnPenDown(){
        ijapa.penDown();
        assertSame(DOWN,ijapa.getPenPosition()) ;
    }
    @Test
    void turtleCanTurnPenUp(){
        ijapa.penUp();
        assertSame(Up,ijapa.getPenPosition());
    }
    @Test
    void turtleCanTurnPenSouth(){
        ijapa.turnRight();
    }
}