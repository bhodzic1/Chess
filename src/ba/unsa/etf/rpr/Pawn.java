package ba.unsa.etf.rpr;

public class Pawn implements ChessPiece{
    private String position;
    ChessPiece.Color colorPawn;

    public Pawn(String pozicija, ChessPiece.Color boja){
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
    public void move(String pozicija) throws IllegalArgumentsException {

    }
}
