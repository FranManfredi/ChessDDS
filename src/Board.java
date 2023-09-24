public class Board{
    private int width;
    private int height;

    private Position[] positions;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.positions= buildBoard(width, height);
    }

    private Position[] buildBoard(int width, int height) {
        Position[] positions = new Position[width * height];
        int positionIndex = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++, positionIndex++) {
                positions[positionIndex] = new BoardPosition(x, y);
            }
        }
        return positions;
    }

    public Position getPosition(int x, int y) {
        return positions[y * width + x];
    }

    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public void placePiece(Piece piece, int x, int y) {
        if (isValidPosition(x, y)) {
            int index = y * width + x;
            if (positions[index] instanceof BoardPosition) {
                // Replace the BoardPosition with a PlayablePosition
                positions[index] = new PlayablePosition(x, y, piece);
            } else {
                // Handle the case where the position is already a PlayablePosition
            }
        } else {
            // Handle the case where the position is not valid
        }
    }

    public void removePiece(Piece piece, int x, int y){
        if (isValidPosition(x, y)) {
            int index = y * width + x;
            if (positions[index] instanceof PlayablePosition) {
                // Replace the PlayablePosition with a BoardPosition
                positions[index] = new BoardPosition(x, y);
                piece.Move();
            } else {
                // Handle the case where the position is already a BoardPosition
            }
        } else {
            // Handle the case where the position is not valid
        }
    }
}
