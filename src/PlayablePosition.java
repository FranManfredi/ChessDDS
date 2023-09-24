public class PlayablePosition implements Position {
    private int x;
    private int y;
    private Piece piece;
    private Color color;

    public PlayablePosition(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public int getPositionX() {
        return x;
    }

    public int getPositionY() {
        return y;
    }

    public Piece getPiece() {
        return piece;
    }

    public boolean isPlayable() {
        return true;
    }
}
