public class PawnMovementRule implements MovementRule{

    public boolean isLegalMove(PlayablePosition playablePosition, Movement movement) {
        if (playablePosition.getPiece().getPieceName() == PieceName.PAWN) {
            if (playablePosition.getPiece().getColor() == Color.WHITE) {
                if (playablePosition.getPiece().isFirstMove()) {
                    if (movement.getMovementX() == 0 && movement.getMovementY() == 1) {
                        return true;
                    } else return movement.getMovementX() == 0 && movement.getMovementY() == 2;
                } else {
                    if (movement.getMovementX() == 0 && movement.getMovementY() == 1) {
                        return true;
                    } else if (movement.getTo().isPlayable()) {
                        if (movement.getMovementX() == 1 && movement.getMovementY() == 1) {
                            return true;
                        } else if (movement.getMovementX() == -1 && movement.getMovementY() == 1) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
            }
            else if (playablePosition.getPiece().getColor() == Color.BLACK) {
                if (playablePosition.getPiece().isFirstMove() == true) {
                    if (movement.getMovementX() == 0 && movement.getMovementY() == -1) {
                        return true;
                    } else if (movement.getMovementX() == 0 && movement.getMovementY() == -2) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if (movement.getMovementX() == 0 && movement.getMovementY() == -1) {
                        return true;
                    } else if (movement.getTo().isPlayable()) {
                        if (movement.getMovementX() == 1 && movement.getMovementY() == -1) {
                            return true;
                        } else if (movement.getMovementX() == -1 && movement.getMovementY() == -1) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
            }
        }
        return false;}
}
