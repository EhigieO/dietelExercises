package turtleChapSeven;

import turtleChapSeven.Position;

public class Pen {
    private Position position;

    public Pen(){
        position = Position.Up;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
