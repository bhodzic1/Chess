package ba.unsa.etf.rpr;

public class Rook implements ChessPiece{
    private String position;
    ChessPiece.Color colorRook;

    public Rook(String pozicija, ChessPiece.Color boja){
        position = pozicija;
        colorRook = boja;
    }
    public void move(String pozicija) throws IllegalArgumentsException {
        //if(pozicija.charAt(0) < 'A' || pozicija.charAt(1) > 'H') throw new IllegalArgumentsException("Netačna pozicija!");
        //if(Math.abs(pozicija.charAt(0) - this.position.charAt(0)) > '1' || Math.abs(pozicija.charAt(1) - this.position.charAt(1) > 1)) throw new IllegalChessMoveException("Nemoguć potez!");
        position = pozicija;

    }
    public Color getColor(){
        return colorRook;
    }
    public String getPosition(){
        return position;
    }
}
