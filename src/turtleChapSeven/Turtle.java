package turtleChapSeven;

public class Turtle {
    private Pen pen;
    private Direction currentDirection;
    public Turtle(){
        pen = new Pen();
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

    public Position getPenPosition(){
        return pen.getPosition();
    }

    public void penUp() {
        pen.setPosition(Position.Up);
    }

    public void turnRight() {
      //  currentDirection =
    }
}
