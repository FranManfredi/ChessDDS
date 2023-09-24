public class Piece {
    Color color;
    Position origin;

    MovementRule[] movementRules;

    PieceName name;

    boolean firstMove;

    public Piece(Color c, Position o, MovementRule[] movementRules, PieceName n) {
        color = c;
        origin = o;
        this.movementRules = movementRules;
        name = n;
        firstMove = true;
    }

    public Position getOrigin() {
        return origin;
    }

    public Color getColor() {
        return color;
    }

    public void Move() {
        firstMove = false;
    }

    public boolean isFirstMove() {
        return firstMove;
    }

    public PieceName getPieceName() {
        return name;
    }

    public boolean isLegalMove(PlayablePosition playablePosition, Movement movement) {
        for (MovementRule rule : movementRules) {
            if (!rule.isLegalMove(playablePosition, movement)) {
                return false;
            }
        }
        return true;
    }

}
