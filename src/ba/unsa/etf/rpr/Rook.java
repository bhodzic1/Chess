package ba.unsa.etf.rpr;

public class Rook extends ChessPiece{
    private String position;
    ChessPiece.Color colorRook;

    public Rook(String pozicija, ChessPiece.Color boja){
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        if (temp1 < 65 || temp1 > 72) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");
        if(boja == Color.WHITE) {
            if ((temp1 == 65 || temp1 == 72) && temp2 == 49) {
                position = pozicija;
                colorRook = boja;
            } else throw new IllegalArgumentException("Netačna pozicija!");
        }
        if(boja == Color.BLACK) {
            if ((temp1 == 65 || temp1 == 72) && temp2 == 56) {
                position = pozicija;
                colorRook = boja;
            } else throw new IllegalArgumentException("Netačna pozicija!");
        }
    }
    @Override
    public void move(String pozicija) throws IllegalChessMoveException {
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        int temp3 = position.charAt(0);
        int temp4 = position.charAt(1);
        if (temp1 < 65 || temp1 > 72) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");
        if(temp1 == temp3){
            position = pozicija; //pomjeranje po istom slovu
        }
        else if(temp2 == temp4) {
            position = pozicija; //pomjeranje po istom broju
        }
    }
    @Override
    public Color getColor(){
        return colorRook;
    }
    @Override
    public String getPosition(){
        return position;
    }
}
