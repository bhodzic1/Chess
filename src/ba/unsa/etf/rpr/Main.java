package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        try {
            b.move(Pawn.class, ChessPiece.Color.WHITE, "E4");
            b.move(Pawn.class, ChessPiece.Color.WHITE, "E5");
            b.move(Pawn.class, ChessPiece.Color.WHITE, "E6");
            b.move(Pawn.class, ChessPiece.Color.WHITE, "D7");
            b.move(Pawn.class, ChessPiece.Color.WHITE, "C8");
        } catch (IllegalChessMoveException e) {
            e.printStackTrace();
        }
    }
}
