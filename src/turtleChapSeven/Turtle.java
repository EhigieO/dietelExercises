package turtleChapSeven;

public class Turtle {
    private Pen pen;
    private Direction currentDirection;
    private TurtlePosition ijapaPosition;
    private Sketchpad mySketchpad;


    public Turtle() {
        pen = new Pen();
        currentDirection = Direction.EAST;
        ijapaPosition = new TurtlePosition();
    }

    public void setPen(Pen biro) {
        this.pen = biro;
    }

    public Pen getPen() {
        return this.pen;
    }


    public void penDown() {
        pen.setPosition(Position.DOWN);
    }

    public Position getPenPosition() {
        return pen.getPosition();
    }

    public void penUp() {
        pen.setPosition(Position.UP);
    }

    public void turnRight() {
        if (currentDirection == Direction.EAST) {
            currentDirection = Direction.SOUTH;
        } else if (currentDirection == Direction.SOUTH) {
            currentDirection = Direction.WEST;
        } else if (currentDirection == Direction.WEST) {
            currentDirection = Direction.NORTH;
        } else if (currentDirection == Direction.NORTH) {
            currentDirection = Direction.EAST;
        }
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        if (currentDirection == Direction.SOUTH) {
            currentDirection = Direction.EAST;
        } else if (currentDirection == Direction.EAST) {
            currentDirection = Direction.NORTH;
        } else if (currentDirection == Direction.NORTH) {
            currentDirection = Direction.WEST;
        } else if (currentDirection == Direction.WEST) {
            currentDirection = Direction.SOUTH;
        }
    }

    public void move(int numberOfSteps) {
        if (currentDirection == Direction.EAST) {
            ijapaPosition.increaseColumnPositionBy(numberOfSteps);
        } else if (currentDirection == Direction.NORTH) {
            ijapaPosition.decreaseRowPositionBy(numberOfSteps);
        } else if (currentDirection == Direction.WEST) {
            ijapaPosition.decreaseColumnPositionBy(numberOfSteps);
        } else if (currentDirection == Direction.SOUTH) {
            ijapaPosition.increaseRowPositionBy(numberOfSteps);
        }
    }

    public TurtlePosition getTurtlePosition() {
        return ijapaPosition;
    }

    public void move(int numberOfSteps, Sketchpad mySketchpad) {

        int columnPosition = ijapaPosition.getColumnPosition();
        int rowPosition = ijapaPosition.getRowPosition();
        if (pen.getPosition() == Position.DOWN && numberOfSteps < 20) {
            if (currentDirection == Direction.EAST) {
                for (int i = columnPosition + 1; i < columnPosition + 1 + numberOfSteps; i++) {
                    mySketchpad.getFloor()[rowPosition][i] = 1;
                }
            }
            if (currentDirection == Direction.SOUTH) {
                for (int i = rowPosition + 1; i < rowPosition + 1 + numberOfSteps; i++) {
                    mySketchpad.getFloor()[i][columnPosition] = 1;
                }
            }
            if (currentDirection == Direction.WEST) {
                for (int i = columnPosition ; i > columnPosition-1- numberOfSteps; i --) {
                    mySketchpad.getFloor()[rowPosition][i] = 1;
                }
            }
            move(numberOfSteps);
        }
    }
}
