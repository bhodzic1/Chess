package ba.unsa.etf.rpr;

public interface ChessPiece {
    public enum Color { BLACK, WHITE};
    String getPosition();
    Color getColor();
    void move(String pozicija) throws IllegalArgumentsException;
}
