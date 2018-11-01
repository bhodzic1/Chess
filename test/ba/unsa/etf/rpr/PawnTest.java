package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    @org.junit.jupiter.api.Test
    void move1() {
        Pawn p = new Pawn("E2", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("E4")
        );
    }
    @org.junit.jupiter.api.Test
    void move2() {
        Pawn p = new Pawn("A2", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("A3")
        );
    }
    @org.junit.jupiter.api.Test
    void moveDiagonal() {
        Pawn p = new Pawn("E2", ChessPiece.Color.WHITE);
        assertThrows( IllegalChessMoveException.class,
                () -> p.move("F4")
        );
    }
    @org.junit.jupiter.api.Test
    void moveBack() {
        Pawn p = new Pawn("A2", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> p.move("A1")
        );
    }
}