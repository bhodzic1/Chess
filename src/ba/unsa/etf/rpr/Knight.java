package ba.unsa.etf.rpr;

public class Knight {
    private String positionKnight;
    ChessPiece.Color colorKnight;
    public Knight(String positionKnight, ChessPiece.Color boja){
        this.positionKnight = positionKnight;
        this.colorKnight = boja;
    }

    public void move(String pozicija) throws IllegalArgumentsException {
        //if(pozicija.charAt(0) < 'A' || pozicija.charAt(1) > 'H') throw new IllegalArgumentsException("Netačna pozicija!");
        //if(Math.abs(pozicija.charAt(0) - this.position.charAt(0)) > '1' || Math.abs(pozicija.charAt(1) - this.position.charAt(1) > 1)) throw new IllegalChessMoveException("Nemoguć potez!");
        positionKnight = pozicija;

    }
}
