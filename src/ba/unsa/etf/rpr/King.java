package ba.unsa.etf.rpr;

import java.lang.Math;



public class King implements ChessPiece{
    private String position;
    ChessPiece.Color colorKing;

    public King(String pozicija, ChessPiece.Color bojaFigure) {
        //if(pozicija.charAt(0) < 'A' || pozicija.charAt(1) > 'H') throw new IllegalArgumentsException("Netačna pozicija!");
        this.position = pozicija;
        this.colorKing = bojaFigure;
    }
    public void move(String pozicija) throws IllegalArgumentsException {

        if(pozicija.charAt(0) < 'A' || pozicija.charAt(1) > 'H') throw new IllegalArgumentsException("Netačna pozicija!");
        position = pozicija;

    }
    public Color getColor(){
        return colorKing;
    }
    public String getPosition(){
        return position;
    }


}
