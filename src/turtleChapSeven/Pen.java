package turtleChapSeven;

public class Pen {
    private Position position;

    public Pen(){
        position = Position.UP;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
