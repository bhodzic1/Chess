package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    @Test
    void move1() {
        Knight k = new Knight("B1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> k.move("C3")
        );
    }

    @Test
    void move2() {
        Knight k = new Knight("G8", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> k.move("H6")
        );
    }

    @Test
    void move3() {
        Knight k = new Knight("B8", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> k.move("D7")
        );
    }

    @Test
    void constructor1() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Knight("B9", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor2() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Knight("I4", ChessPiece.Color.BLACK)
        );
    }

    @Test
    void move4() {
        Knight k = new Knight("B1", ChessPiece.Color.BLACK);
        assertThrows( IllegalChessMoveException.class,
                () -> k.move("A4")
        );
    }

    @Test
    void constructor3() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Knight("", ChessPiece.Color.WHITE)
        );
    }
}