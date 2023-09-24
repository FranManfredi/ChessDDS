public class Movement{
    private Position from;
    private Position to;

    public Movement(Position from, Position to) {
        this.from = from;
        this.to = to;
    }

    public Position getFrom() {
        return from;
    }

    public Position getTo() {
        return to;
    }

    public int getMovementX() {
        return to.getPositionX() - from.getPositionX();
    }

    public int getMovementY() {
        return to.getPositionY() - from.getPositionY();
    }

}
