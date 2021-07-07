package turtleChapSeven;

import turtleChapSeven.Position;

public class Pen {
    private Position position;

    public Pen(){
        position = Position.Up;
    }
    public void setPosition(Position down) {
        position = Position.DOWN;
    }

    public Position getPosition() {
        position = Position.Up;
        return position;
    }
}
