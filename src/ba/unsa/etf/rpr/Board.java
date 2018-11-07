package ba.unsa.etf.rpr;

import java.util.*;

public class Board {

    public ArrayList<ChessPiece> lista = new ArrayList<ChessPiece>();

    public Board() {

        lista.add(new King("E1", ChessPiece.Color.WHITE));
        lista.add(new King("E8", ChessPiece.Color.BLACK));
        lista.add(new Queen("D1", ChessPiece.Color.WHITE));
        lista.add(new Queen("D8", ChessPiece.Color.BLACK));
        lista.add(new Rook("A1", ChessPiece.Color.WHITE));
        lista.add(new Rook("H1", ChessPiece.Color.WHITE));
        lista.add(new Rook("A8", ChessPiece.Color.BLACK));
        lista.add(new Rook("H8", ChessPiece.Color.BLACK));
        lista.add(new Bishop("C1", ChessPiece.Color.WHITE));
        lista.add(new Bishop("F1", ChessPiece.Color.WHITE));
        lista.add(new Bishop("C8", ChessPiece.Color.BLACK));
        lista.add(new Bishop("F8", ChessPiece.Color.BLACK));
        lista.add(new Knight("B1", ChessPiece.Color.WHITE));
        lista.add(new Knight("G1", ChessPiece.Color.WHITE));
        lista.add(new Knight("B8", ChessPiece.Color.BLACK));
        lista.add(new Knight("G8", ChessPiece.Color.BLACK));

    }


    public boolean isCheck(ChessPiece.Color boja) {


        return true;
    }

    public void move(Class figura, ChessPiece.Color boja, String pozicija){

    }

    public void move(String oldPosition, String newPosition) throws IllegalChessMoveException, IllegalArgumentException{


    }
}
