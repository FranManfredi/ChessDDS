public class Player {
    private Color color;
    private boolean isTurn;

    public Player(Color color) {
        this.color = color;
        isTurn = false;
    }

    public Color getColor() {
        return color;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public void makeMove(PlayablePosition playablePosition, Movement movement, Board board){
    if (playablePosition.getPiece().getColor()==color){
        if(playablePosition.getPiece().isLegalMove(playablePosition,movement)){
            if(movement.getTo().isPlayable()) {
                PlayablePosition playablePosition1 = (PlayablePosition) movement.getTo();
                if (playablePosition1.getPiece().getColor() == color) {
                    System.out.println("Illegal Move");
                    return;
                } else if (playablePosition1.getPiece().getColor() != color) {
                    board.removePiece(playablePosition1.getPiece(), movement.getTo().getPositionX(), movement.getTo().getPositionY());
                }
            }
            board.placePiece(playablePosition.getPiece(),movement.getTo().getPositionX(),movement.getTo().getPositionY());
            board.removePiece(playablePosition.getPiece(),movement.getFrom().getPositionX(),movement.getFrom().getPositionY());
            System.out.println("Move Successful from: "+movement.getFrom().getPositionX()+","+movement.getFrom().getPositionY()+" to: "+movement.getTo().getPositionX()+","+movement.getTo().getPositionY());
        }
        else{
            System.out.println("Illegal Move");
        }
    }
    }
}
