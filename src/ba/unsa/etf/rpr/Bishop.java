package ba.unsa.etf.rpr;

public class Bishop implements ChessPiece {
    private String position;
    ChessPiece.Color colorBishop;
    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public Color getColor() {
        return colorBishop;
    }

    @Override
    public void move(String pozicija) throws IllegalArgumentsException {

    }
}
