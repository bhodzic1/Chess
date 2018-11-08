package ba.unsa.etf.rpr;

public class Rook extends ChessPiece{
    private String position;
    ChessPiece.Color colorRook;

    public Rook(String pozicija, ChessPiece.Color boja){
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        if (temp1 < 65 || (temp1 > 72 && temp1 < 97) || temp1 > 104) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");

        position = pozicija;
        colorRook = boja;


    }
    @Override
    public void move(String pozicija) throws IllegalChessMoveException, IllegalArgumentException {
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        int temp3 = position.charAt(0);
        int temp4 = position.charAt(1);
        String pomocni1 = new String();
        pomocni1 = pozicija.substring(1,2);
        System.out.println(pomocni1);
        if (temp1 < 65 || (temp1 > 72 && temp1 < 97) || temp1 > 104) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");

        if(temp1 == temp3){
            position = pozicija; //pomjeranje po istom slovu
        }
        else if(temp2 == temp4) {
            position = pozicija; //pomjeranje po istom broju
        }
        else throw new IllegalChessMoveException("Netačna pozicija!");
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
