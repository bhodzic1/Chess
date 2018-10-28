package ba.unsa.etf.rpr;

public abstract class ChessPiece {
    public String position;
    public static enum Color { BLACK, WHITE};
    abstract String getPosition();
    abstract Color getColor();
    void move(String pozicija) throws IllegalChessMoveException{
        position = pozicija;
    };
}
