package ba.unsa.etf.rpr;

import java.lang.Math;

public class Bishop extends ChessPiece {
    private String position;
    ChessPiece.Color colorBishop;
    public Bishop(String pozicija, ChessPiece.Color boja){
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        if (temp1 < 65 || (temp1 > 72 && temp1 < 97) || temp1 > 104) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");

        position = pozicija;
        colorBishop = boja;

    }
    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public Color getColor() {
        return colorBishop;
    }

    @Override
    public void move(String pozicija) throws IllegalChessMoveException, IllegalArgumentException {
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        int temp3 = position.charAt(0);
        int temp4 = position.charAt(1);
        if (temp1 < 65 || (temp1 > 72 && temp1 < 97) || temp1 > 104) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");
        if(colorBishop == Color.WHITE){
            if(Math.abs(temp1 - temp3) == Math.abs(temp2 - temp4)){
                position = pozicija;
            }
            else throw new IllegalChessMoveException("Netačna pozicija!");
        }
        if(colorBishop == Color.BLACK){
            if(Math.abs(temp1 - temp3) == Math.abs(temp2 - temp4)){
                position = pozicija;
            }
            else throw new IllegalChessMoveException("Netačna pozicija!");
        }
    }
}
