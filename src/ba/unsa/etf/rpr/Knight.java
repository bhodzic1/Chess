package ba.unsa.etf.rpr;

public class Knight extends ChessPiece {
    private String positionKnight;
    ChessPiece.Color colorKnight;
    public Knight(String pozicija, ChessPiece.Color boja){
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        if (temp1 < 65 || (temp1 > 72 && temp1 < 97) || temp1 > 104) throw new IllegalArgumentException("Netačna pozicija!");
        if (temp2 < 49 || temp2 > 56) throw new IllegalArgumentException("Netačna pozicija!");
        this.positionKnight = pozicija;
        this.colorKnight = boja;
    }
    @Override
    public void move(String pozicija) throws IllegalArgumentException, IllegalChessMoveException {
        if(pozicija == "") throw new IllegalArgumentException("Netačna pozicija!");
        int temp1 = pozicija.charAt(0);
        int temp2 = pozicija.charAt(1);
        int temp3 = positionKnight.charAt(0);
        int temp4 = positionKnight.charAt(1);
        if(Math.abs(temp1 - temp3) == 1 && Math.abs(temp2 - temp4) == 2){
            positionKnight = pozicija;
        }
        else if(Math.abs(temp1 - temp3) == 2 && Math.abs(temp2 - temp4) == 1){
            positionKnight = pozicija;
        }
        else throw new IllegalChessMoveException("Netačna pozicija!");

    }
    @Override
    public String getPosition(){
        return positionKnight;
    }
    @Override
    public Color getColor() {
        return colorKnight;
    }
}
