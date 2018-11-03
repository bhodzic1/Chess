package ba.unsa.etf.rpr;

public class Board {
    protected ChessPiece[][] tabla = new ChessPiece[4][8];

    public Board() {
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(i == 0 && j == 4){
                    tabla[i][j] = new King("E8", ChessPiece.Color.BLACK);
                }
                else if(i == 3 && j == 4){
                    tabla[i][j] = new King("E1", ChessPiece.Color.WHITE);
                }
                else if(i == 0 && j == 3){
                    tabla[i][j] = new Queen("D8", ChessPiece.Color.BLACK);
                }
                else if(i == 3 && j == 3){
                    tabla[i][j] = new Queen("D1", ChessPiece.Color.WHITE);
                }
                else if(i == 0 && j == 0){
                    tabla[i][j] = new Rook("A8", ChessPiece.Color.BLACK);
                }
                else if(i == 0 && j == 1){
                    tabla[i][j] = new Knight("B8", ChessPiece.Color.BLACK);
                }
                else if(i == 0 && j == 2){
                    tabla[i][j] = new Bishop("C8", ChessPiece.Color.BLACK);
                }
                else if(i == 0 && j == 5){
                    tabla[i][j] = new Bishop("F8", ChessPiece.Color.BLACK);
                }
                else if(i == 0 && j == 6){
                    tabla[i][j] = new Knight("G8", ChessPiece.Color.BLACK);
                }
                else if(i == 0 && j == 7){
                    tabla[i][j] = new Rook("H8", ChessPiece.Color.BLACK);
                }
                else if(i == 1 && j == 0){
                    tabla[i][j] = new Pawn("A7", ChessPiece.Color.BLACK);
                }
                else if(i == 1 && j == 1){
                    tabla[i][j] = new Pawn("B7", ChessPiece.Color.BLACK);
                }
                else if(i == 1 && j == 2){
                    tabla[i][j] = new Pawn("C7", ChessPiece.Color.BLACK);
                }
                else if(i == 1 && j == 3){
                    tabla[i][j] = new Pawn("D7", ChessPiece.Color.BLACK);
                }
                else if(i == 1 && j == 4){
                    tabla[i][j] = new Pawn("E7", ChessPiece.Color.BLACK);
                }
                else if(i == 1 && j == 5){
                    tabla[i][j] = new Pawn("F7", ChessPiece.Color.BLACK);
                }
                else if(i == 1 && j == 6){
                    tabla[i][j] = new Pawn("G7", ChessPiece.Color.BLACK);
                }
                else if(i == 1 && j == 7){
                    tabla[i][j] = new Pawn("H7", ChessPiece.Color.BLACK);
                }
                else if(i == 2 && j == 0){
                    tabla[i][j] = new Pawn("A2", ChessPiece.Color.WHITE);
                }
                else if(i == 2 && j == 1){
                    tabla[i][j] = new Pawn("B2", ChessPiece.Color.WHITE);
                }
                else if(i == 2 && j == 2){
                    tabla[i][j] = new Pawn("C2", ChessPiece.Color.WHITE);
                }
                else if(i == 2 && j == 3){
                    tabla[i][j] = new Pawn("D2", ChessPiece.Color.WHITE);
                }
                else if(i == 2 && j == 4){
                    tabla[i][j] = new Pawn("E2", ChessPiece.Color.WHITE);
                }
                else if(i == 2 && j == 5){
                    tabla[i][j] = new Pawn("F2", ChessPiece.Color.WHITE);
                }
                else if(i == 2 && j == 6){
                    tabla[i][j] = new Pawn("G2", ChessPiece.Color.WHITE);
                }
                else if(i == 2 && j == 7){
                    tabla[i][j] = new Pawn("H2", ChessPiece.Color.WHITE);
                }
                else if(i == 3 && j == 0){
                    tabla[i][j] = new Rook("A1", ChessPiece.Color.WHITE);
                }
                else if(i == 3 && j == 1){
                    tabla[i][j] = new Knight("B1", ChessPiece.Color.WHITE);
                }
                else if(i == 3 && j == 2){
                    tabla[i][j] = new Bishop("C1", ChessPiece.Color.WHITE);
                }
                else if(i == 3 && j == 5){
                    tabla[i][j] = new Bishop("F1", ChessPiece.Color.WHITE);
                }
                else if(i == 3 && j == 6){
                    tabla[i][j] = new Knight("G1", ChessPiece.Color.WHITE);
                }
                else if(i == 3 && j == 7){
                    tabla[i][j] = new Rook("H1", ChessPiece.Color.WHITE);
                }
            }
        }


    }


    public boolean isCheck(ChessPiece.Color boja) {

        return false;
    }

    public void move(Class figura, ChessPiece.Color boja, String pozicija){

    }

    public void move(String oldPosition, String newPosition) throws IllegalChessMoveException, IllegalArgumentException, NullPointerException{
        int temp1 = oldPosition.charAt(0);
        int temp2 = oldPosition.charAt(1);
        int temp3 = newPosition.charAt(0);
        int temp4 = newPosition.charAt(1);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 8; j++){
                if (tabla[i][j] != null) {
                    if (tabla[i][j].getPosition().equals(newPosition))
                        tabla[i][j] = null;
                }
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 8; j++){
                if(tabla[i][j] != null) {
                    if (tabla[i][j].getPosition().equals(oldPosition))
                        tabla[i][j].move(newPosition);
                }
            }
        }
    }
}
