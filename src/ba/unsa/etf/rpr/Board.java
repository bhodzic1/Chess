package ba.unsa.etf.rpr;

public class Board {
    private King whiteKing, blackKing;
    public Board(){
        whiteKing = new King("E1", ChessPiece.Color.WHITE);
        blackKing = new King("E8", ChessPiece.Color.BLACK);

    }

    public boolean isCheck(ChessPiece.Color white) {
        return false;
    }

    public void move(Class figura, ChessPiece.Color boja, String pozicija){

    }

    public void move(String oldPosition, String newPosition){

    }
}
