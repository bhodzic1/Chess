package ba.unsa.etf.rpr;

public class Knight extends ChessPiece {
    private String positionKnight;
    ChessPiece.Color colorKnight;
    public Knight(String positionKnight, ChessPiece.Color boja){
        this.positionKnight = positionKnight;
        this.colorKnight = boja;
    }
    @Override
    public void move(String pozicija) throws IllegalArgumentException, IllegalChessMoveException {
        //if(pozicija.charAt(0) < 'A' || pozicija.charAt(1) > 'H') throw new IllegalArgumentsException("Netačna pozicija!");
        //if(Math.abs(pozicija.charAt(0) - this.position.charAt(0)) > '1' || Math.abs(pozicija.charAt(1) - this.position.charAt(1) > 1)) throw new IllegalChessMoveException("Nemoguć potez!");
        positionKnight = pozicija;

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
