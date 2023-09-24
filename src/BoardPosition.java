public class BoardPosition implements Position {
    private int positionX;
    private int positionY;
    private PlayablePosition playablePosition;

    public BoardPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isPlayable() {
        return false;
    }
}
