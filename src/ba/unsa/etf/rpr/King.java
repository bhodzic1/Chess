package ba.unsa.etf.rpr;

import java.lang.Math;
import java.lang.RuntimeException;


public class King extends ChessPiece{
    private String position;
    ChessPiece.Color colorKing;



    public King(String pozicija, ChessPiece.Color boja) {
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        if (temp1 < 65 || temp1 > 72) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");

        position = pozicija;
        colorKing = boja;
    }
    public void move(String pozicija) throws IllegalChessMoveException, IllegalArgumentException {
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        int temp3 = this.position.charAt(0);
        int temp4 = this.position.charAt(1);
        if (temp1 < 65 || (temp1 > 72 && temp1 < 97) || temp1 > 104) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp1 >= 97 && temp1 <= 104)
            temp1 -= 32;
        if(colorKing == Color.WHITE){
            if(temp1 == temp3 && Math.abs(temp2 - temp4) == 1){
                position = pozicija;
            }
            else if(temp2 == temp4 && Math.abs(temp1 - temp3) == 1){
                position = pozicija;
            }
            else if(Math.abs(temp1 - temp3) == 1 && Math.abs(temp2 - temp4) == 1){
                position = pozicija;
            }
            else throw new IllegalChessMoveException("Netačna pozicija!");
        }
        if(colorKing == Color.BLACK){
            if(temp1 == temp3 && Math.abs(temp2 - temp4) == 1){
                position = pozicija;
            }
            else if(temp2 == temp4 && Math.abs(temp1 - temp3) == 1){
                position = pozicija;
            }
            else if(Math.abs(temp1 - temp3) == 1 && Math.abs(temp2 - temp4) == 1){
                position = pozicija;
            }
            else throw new IllegalChessMoveException("Netačna pozicija!");
        }

    }
    public Color getColor(){
        return colorKing;
    }
    public String getPosition(){
        return position;
    }

}
