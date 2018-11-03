package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    @org.junit.jupiter.api.Test
    void moveDiagonal() {
        Queen k = new Queen("D1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> k.move("C2")
        );
    }

    @org.junit.jupiter.api.Test
    void constructor() {
        Queen k = new Queen("D8", ChessPiece.Color.BLACK);
        assertThrows( IllegalChessMoveException.class,
                () -> k.move("E2")
        );
    }

    @org.junit.jupiter.api.Test
    void moveMorePositions() {
        Queen k = new Queen("D1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> k.move("H5")
        );
    }

    @org.junit.jupiter.api.Test
    void constructor1() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Queen("I2", ChessPiece.Color.WHITE)
        );
    }

    @org.junit.jupiter.api.Test
    void constructor2() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Queen("B9", ChessPiece.Color.WHITE)
        );
    }

    @org.junit.jupiter.api.Test
    void constructor3() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Queen("", ChessPiece.Color.WHITE)
        );
    }

    @org.junit.jupiter.api.Test
    void moveIllegal1() {
        Queen k = new Queen("D8", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("D9")
        );
    }

    @org.junit.jupiter.api.Test
    void moveIllegal2() {
        Queen k = new Queen("D1", ChessPiece.Color.WHITE);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("I1")
        );
    }

    @org.junit.jupiter.api.Test
    void moveIllegal3() {
        Queen k = new Queen("D8", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("")
        );
    }
}