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
        lista.add(new Pawn("A2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("B2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("C2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("D2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("E2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("F2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("G2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("H2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("A7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("B7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("C7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("D7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("E7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("F7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("G7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("H7", ChessPiece.Color.BLACK));

    }

    public boolean jeLiPozicijaZauzeta(String position){
        for(ChessPiece c : lista){
            if(c.getPosition().equals(position))
                return true;
        }
        return false;
    }

    public boolean isCheck(ChessPiece.Color boja) {


        return true;
    }

    public void move(Class figura, ChessPiece.Color boja, String pozicija){

    }

    public void move(String oldPosition, String newPosition) throws IllegalChessMoveException, IllegalArgumentException{

        for(ChessPiece c : lista){
            if(c.getPosition().equals(oldPosition)){
                if(jeLiPozicijaZauzeta(newPosition)){
                    for(ChessPiece d : lista){
                        if(d.getPosition().equals(newPosition)) {
                            lista.remove(d);
                        }
                    }
                }
                c.move(newPosition);
            }
        }

    }
}
