package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    @Test
    void move1() {
        Bishop b = new Bishop("C1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> b.move("A3")
        );
    }

    @Test
    void move2() {
        Bishop b = new Bishop("E6", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> b.move("H3")
        );
    }

    @Test
    void move3() {
        Bishop b = new Bishop("C8", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> b.move("A6")
        );
    }

    @Test
    void constructor1() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Bishop("B9", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor2() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Bishop("I4", ChessPiece.Color.BLACK)
        );
    }

    @Test
    void move4() {
        Bishop b = new Bishop("E7", ChessPiece.Color.BLACK);
        assertThrows( IllegalChessMoveException.class,
                () -> b.move("E3")
        );
    }

    @Test
    void constructor3() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Bishop("", ChessPiece.Color.WHITE)
        );
    }
}