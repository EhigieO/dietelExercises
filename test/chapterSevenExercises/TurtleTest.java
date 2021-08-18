package chapterSevenExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleChapSeven.Pen;
import turtleChapSeven.Sketchpad;
import turtleChapSeven.Turtle;
import turtleChapSeven.TurtlePosition;

import static turtleChapSeven.Direction.*;
import static turtleChapSeven.Position.DOWN;
import static org.junit.jupiter.api.Assertions.*;
import static turtleChapSeven.Position.UP;

class TurtleTest {
    Turtle ijapa;
    Pen biro;

    @BeforeEach
    void setUp() {
        ijapa = new Turtle();
        biro = new Pen();
    }

    @Test
    void turtleCanBeConstructed() {
        assertNotNull(ijapa);
    }

    @Test
    void turtleHasAPenTest() {
        ijapa.setPen(biro);
        assertSame(biro, ijapa.getPen());
    }

    @Test
    void turtleHasPenOnCreation() {
        assertNotNull(ijapa.getPen());
    }

    @Test
    void turtleCanChangePenTest() {
        ijapa.setPen(biro);
        assertSame(biro, ijapa.getPen());
    }

    @Test
    void turtleCanTurnPenDown() {
        ijapa.penUp();
        assertSame(UP, ijapa.getPenPosition());

        ijapa.penDown();
        assertSame(DOWN, ijapa.getPenPosition());
    }

    @Test
    void turtleCanTurnPenUp() {
        ijapa.penUp();
        assertSame(UP, ijapa.getPenPosition());
    }

    @Test
    void turtleCanTurnRight() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeft() {
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardOnTheX_AxisFacingEast() {
        TurtlePosition ijapaPosition = ijapa.getTurtlePosition();

        assertEquals(0, ijapaPosition.getColumnPosition());
        assertEquals(0, ijapaPosition.getRowPosition());
        ijapa.move(5);
        //if turtle is facing east
        assertEquals(5, ijapaPosition.getColumnPosition());
        assertEquals(0, ijapaPosition.getRowPosition());

    }

    @Test
    void turtleCanMoveForwardOnTheY_AxisFacingNorth() {
        TurtlePosition ijapaPosition = ijapa.getTurtlePosition();

        assertEquals(0, ijapaPosition.getColumnPosition());
        assertEquals(0, ijapaPosition.getRowPosition());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.move(10);
        assertEquals(-10, ijapaPosition.getRowPosition());
        assertEquals(0, ijapaPosition.getColumnPosition());

    }

    @Test
    void turtleCanMoveForwardOnTheX_AxisFacingWest() {
        TurtlePosition ijapaPosition = ijapa.getTurtlePosition();
        ijapa.move(15);
        assertEquals(15, ijapaPosition.getColumnPosition());
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.move(10);
        assertEquals(5, ijapaPosition.getColumnPosition());
        assertEquals(0, ijapaPosition.getRowPosition());
    }

    @Test
    void turtleCanMoveForwardOnTheY_AxisFacingSouth() {
        TurtlePosition ijapaPosition = ijapa.getTurtlePosition();
        ijapa.turnRight();
        ijapa.move(10);
        assertEquals(10, ijapaPosition.getRowPosition());
        assertEquals(0, ijapaPosition.getColumnPosition());
    }

    @Test
    void turtleCanWriteWhenPenIsDownAndTurtleFacingEast() {
        Sketchpad sketchpad = new Sketchpad(20, 20);
        ijapa.penDown();

        ijapa.move(5, sketchpad);
        assertEquals(0, sketchpad.getFloor()[0][0]);
        assertEquals(1, sketchpad.getFloor()[0][1]);
        assertEquals(1, sketchpad.getFloor()[0][2]);
        assertEquals(1, sketchpad.getFloor()[0][3]);
        assertEquals(1, sketchpad.getFloor()[0][4]);
        assertEquals(1, sketchpad.getFloor()[0][5]);

        sketchpad.displayMethod();
    }

    @Test
    void turtleCanWriteWhenPenIsDownAndTurtleFacingSouth() {
        Sketchpad sketchpad = new Sketchpad(20, 20);
        ijapa.penDown();
        ijapa.turnRight();
        ijapa.move(5, sketchpad);

        assertEquals(0, sketchpad.getFloor()[0][0]);
        assertEquals(1, sketchpad.getFloor()[1][0]);
        assertEquals(1, sketchpad.getFloor()[2][0]);
        assertEquals(1, sketchpad.getFloor()[3][0]);
        assertEquals(1, sketchpad.getFloor()[4][0]);
        assertEquals(1, sketchpad.getFloor()[5][0]);

        ijapa.move(3, sketchpad);

        ijapa.turnLeft();
        ijapa.move(19, sketchpad);

        sketchpad.displayMethod();
    }

    @Test
    void turtleCanWriteWhenPenIsDownAndTurtleFacingWest() {
    Sketchpad sketchpad = new Sketchpad(20, 20);
        ijapa.penDown();
        ijapa.move(15,sketchpad);

    ijapa.turnRight();
    ijapa.move(3,sketchpad);
    ijapa.turnRight();
    ijapa.move(10,sketchpad);


        assertEquals(0,sketchpad.getFloor()[0][16]);
        assertEquals(1,sketchpad.getFloor()[0][15]);
        assertEquals(1,sketchpad.getFloor()[0][14]);
        assertEquals(1,sketchpad.getFloor()[0][13]);
        assertEquals(1,sketchpad.getFloor()[0][12]);
        assertEquals(1,sketchpad.getFloor()[0][11]);
        assertEquals(1,sketchpad.getFloor()[0][10]);
        assertEquals(1,sketchpad.getFloor()[0][9]);
        assertEquals(1,sketchpad.getFloor()[0][8]);
        assertEquals(1,sketchpad.getFloor()[0][7]);
        ijapa.turnLeft();
        ijapa.move(5,sketchpad);
        sketchpad.displayMethod();
} @Test
    void turtleCanWriteWhenPenIsDownAndTurtleFacingNorth() {
    Sketchpad sketchpad = new Sketchpad(20, 20);
        ijapa.penDown();
        ijapa.move(15,sketchpad);

    ijapa.turnRight();
    ijapa.move(3,sketchpad);
    ijapa.turnRight();
    ijapa.move(10,sketchpad);


        assertEquals(0,sketchpad.getFloor()[0][16]);
        assertEquals(1,sketchpad.getFloor()[0][15]);
        assertEquals(1,sketchpad.getFloor()[0][14]);
        assertEquals(1,sketchpad.getFloor()[0][13]);
        assertEquals(1,sketchpad.getFloor()[0][12]);
        assertEquals(1,sketchpad.getFloor()[0][11]);
        assertEquals(1,sketchpad.getFloor()[0][10]);
        assertEquals(1,sketchpad.getFloor()[0][9]);
        assertEquals(1,sketchpad.getFloor()[0][8]);
        assertEquals(1,sketchpad.getFloor()[0][7]);
        ijapa.turnLeft();
        ijapa.move(5,sketchpad);
        ijapa.turnLeft();
        ijapa.move(6,sketchpad);
        ijapa.turnLeft();
        ijapa.move(8,sketchpad);

        assertEquals(1,sketchpad.getFloor()[7][11]);
        assertEquals(1,sketchpad.getFloor()[8][11]);
        assertEquals(1,sketchpad.getFloor()[7][11]);
        assertEquals(1,sketchpad.getFloor()[6][11]);
        assertEquals(1,sketchpad.getFloor()[5][11]);
        assertEquals(1,sketchpad.getFloor()[4][11]);
        assertEquals(1,sketchpad.getFloor()[3][11]);
        assertEquals(1,sketchpad.getFloor()[2][11]);
        assertEquals(1,sketchpad.getFloor()[1][11]);
        assertEquals(1,sketchpad.getFloor()[0][11]);

        sketchpad.displayMethod();
}

}