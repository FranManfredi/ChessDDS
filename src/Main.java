public class Main {
    public static void main(String[] args) {
        Board board=new Board(8,8);
        PawnMovementRule pawnMovementRule = new PawnMovementRule();
        MovementRule[] movementRules = {pawnMovementRule};
        Piece blackPawn = new Piece(Color.WHITE, board.getPosition(1, 1), movementRules, PieceName.PAWN);
        Piece whitePawn = new Piece(Color.BLACK, board.getPosition(1, 6), movementRules, PieceName.PAWN);
        Piece whitePawn2 = new Piece(Color.BLACK, board.getPosition(1, 5), movementRules, PieceName.PAWN);
        Piece[] pieces = {blackPawn, whitePawn, whitePawn2};
        Game game = new Game(board, pieces);
        game.whitePlayer.makeMove((PlayablePosition) board.getPosition(1, 1), new Movement(board.getPosition(1, 1), board.getPosition(1, 3)), board);
        game.whitePlayer.makeMove((PlayablePosition) board.getPosition(1, 3), new Movement(board.getPosition(1, 3), board.getPosition(1, 5)), board);
        game.blackPlayer.makeMove((PlayablePosition) board.getPosition(1, 6), new Movement(board.getPosition(1, 6), board.getPosition(1, 5)), board);
    }
}