package ba.unsa.etf.rpr;

public class Queen extends ChessPiece{
    private String position;
    ChessPiece.Color colorQueen;

    public Queen(String pozicija, ChessPiece.Color boja){
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        if (temp1 < 65 || temp1 > 72) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");
        if(boja == Color.WHITE){
            if(temp1 == 68 && temp2 == 49){
                position = pozicija;
                colorQueen = boja;
            }
            else throw new IllegalArgumentException("Netačna pozicija!");
        }
        if(boja == Color.BLACK){
            if(temp1 == 68 && temp2 == 56){
                position = pozicija;
                colorQueen = boja;
            }
            else throw new IllegalArgumentException("Netačna pozicija!");
        }
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public Color getColor() {
        return colorQueen;
    }

    @Override
    public void move(String pozicija) throws IllegalChessMoveException, IllegalArgumentException{
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        int temp3 = position.charAt(0);
        int temp4 = position.charAt(1);
        if (temp1 < 65 || temp1 > 72) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");
        if(colorQueen == Color.WHITE){
            if(Math.abs(temp1 - temp3) == Math.abs(temp2 - temp4) || (temp1 == temp3) || (temp2 == temp4)){
                position = pozicija;
            }
            else throw new IllegalChessMoveException("Netačna pozicija!");
        }
        if(colorQueen == Color.BLACK){
            if(Math.abs(temp1 - temp3) == Math.abs(temp2 - temp4) || (temp1 == temp3) || (temp2 == temp4)){
                position = pozicija;
            }
            else throw new IllegalChessMoveException("Netačna pozicija!");
        }
    }
}
