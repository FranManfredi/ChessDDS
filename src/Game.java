public class Game {
    private Board board;
    public Player whitePlayer;
    public Player blackPlayer;
    private MovementRule[] movementRules;
    private boolean isOver;

    public Game(Board board, Piece[] pieces) {
        this.board=board;
        whitePlayer = new Player(Color.WHITE);
        blackPlayer = new Player(Color.BLACK);
        isOver = false;
        initializeBoardWithPieces(pieces);

    }

    private void initializeBoardWithPieces(Piece[] pieces) {
        for (Piece piece : pieces) {
            Position position = piece.getOrigin(); // Get the piece's origin position
            board.placePiece(piece, position.getPositionX(), position.getPositionY()); // Place the piece on the board
        }
    }


}
