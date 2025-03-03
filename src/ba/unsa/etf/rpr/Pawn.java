package ba.unsa.etf.rpr;

public class Pawn extends ChessPiece implements Cloneable{
    private String position;
    ChessPiece.Color colorPawn;

    public Pawn(String pozicija, ChessPiece.Color boja){
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        if (temp1 < 65 || (temp1 > 72 && temp1 < 97) || temp1 > 104) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");

        position = pozicija;
        colorPawn = boja;
    }
    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public Color getColor() {
        return colorPawn;
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
        if(colorPawn == ChessPiece.Color.WHITE) {
            if(temp1 == temp3 && temp2 == 52 && temp4 == 50){
                position = pozicija;
            }
            else if (temp1 == temp3 && temp2 - temp4 == 1) {
                position = pozicija;
            }
            else if ((temp1 - temp3 == 1 || temp1 - temp3 == -1) && temp2 - temp4 == 1) {
                position = pozicija;
            }
            else throw new IllegalChessMoveException("Netačna pozicija!");
        }
        if(colorPawn == ChessPiece.Color.BLACK){
            if(temp1 == temp3 && temp2 == 55 && temp4 == 53){
                position = pozicija;
            }
            else if (temp1 == temp3 && temp4 - temp2 == 1) {
                position = pozicija;
            }
            else if ((temp1 - temp3 == 1 || temp1 - temp3 == -1) && temp4 - temp2 == 1) {
                position = pozicija;
            }
            else throw new IllegalChessMoveException("Netačna pozicija!");
        }
    }

    @Override
    public String toString () {
        return getColor() + " " + getPosition();
    }
}
