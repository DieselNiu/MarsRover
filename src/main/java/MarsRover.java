public class MarsRover {
    private final Position position;
    private Direction direction;

    public MarsRover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public int getPositionX() {
        return this.position.getX();
    }

    public int getPositionY() {
        return this.position.getY();
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnLeft() {
        this.direction = direction.toLeft();
    }
}
