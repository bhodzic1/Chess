package ba.unsa.etf.rpr;

import java.lang.Math;
import java.lang.RuntimeException;


public class King extends ChessPiece{
    private String position;
    ChessPiece.Color colorKing;



    public King(String pozicija, ChessPiece.Color bojaFigure) {
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        if (temp1 < 65 || temp1 > 72) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");

        position = pozicija;
        colorKing = bojaFigure;
    }
    public void move(String pozicija) throws IllegalChessMoveException, IllegalArgumentException {
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        int temp3 = this.position.charAt(0);
        int temp4 = this.position.charAt(1);
        if (temp1 < 65 || temp1 > 72) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");
        if(Math.abs(temp3 - temp1) > 1) throw new IllegalChessMoveException("Netačna pozicija!");
        else if(Math.abs(temp4 - temp2) > 1)  throw new IllegalChessMoveException("Netačna pozicija!");
        position = pozicija;

    }
    public Color getColor(){
        return colorKing;
    }
    public String getPosition(){
        return position;
    }

}
