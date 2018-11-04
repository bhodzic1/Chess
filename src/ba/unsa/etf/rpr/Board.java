package ba.unsa.etf.rpr;

public class Board {
    public static ChessPiece[][] tabla = new ChessPiece[8][8];

    public Board() {
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(i == 0 && j == 4){
                    tabla[i][j] = new King("E8", ChessPiece.Color.BLACK);
                }
                else if(i == 7 && j == 4){
                    tabla[i][j] = new King("E1", ChessPiece.Color.WHITE);
                }
                else if(i == 0 && j == 3){
                    tabla[i][j] = new Queen("D8", ChessPiece.Color.BLACK);
                }
                else if(i == 7 && j == 3){
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
                else if(i == 6 && j == 0){
                    tabla[i][j] = new Pawn("A2", ChessPiece.Color.WHITE);
                }
                else if(i == 6 && j == 1){
                    tabla[i][j] = new Pawn("B2", ChessPiece.Color.WHITE);
                }
                else if(i == 6 && j == 2){
                    tabla[i][j] = new Pawn("C2", ChessPiece.Color.WHITE);
                }
                else if(i == 6 && j == 3){
                    tabla[i][j] = new Pawn("D2", ChessPiece.Color.WHITE);
                }
                else if(i == 6 && j == 4){
                    tabla[i][j] = new Pawn("E2", ChessPiece.Color.WHITE);
                }
                else if(i == 6 && j == 5){
                    tabla[i][j] = new Pawn("F2", ChessPiece.Color.WHITE);
                }
                else if(i == 6 && j == 6){
                    tabla[i][j] = new Pawn("G2", ChessPiece.Color.WHITE);
                }
                else if(i == 6 && j == 7){
                    tabla[i][j] = new Pawn("H2", ChessPiece.Color.WHITE);
                }
                else if(i == 7 && j == 0){
                    tabla[i][j] = new Rook("A1", ChessPiece.Color.WHITE);
                }
                else if(i == 7 && j == 1){
                    tabla[i][j] = new Knight("B1", ChessPiece.Color.WHITE);
                }
                else if(i == 7 && j == 2){
                    tabla[i][j] = new Bishop("C1", ChessPiece.Color.WHITE);
                }
                else if(i == 7 && j == 5){
                    tabla[i][j] = new Bishop("F1", ChessPiece.Color.WHITE);
                }
                else if(i == 7 && j == 6){
                    tabla[i][j] = new Knight("G1", ChessPiece.Color.WHITE);
                }
                else if(i == 7 && j == 7){
                    tabla[i][j] = new Rook("H1", ChessPiece.Color.WHITE);
                }
                else tabla[i][j] = null;
            }
        }


    }


    public boolean isCheck(ChessPiece.Color boja) {

        return false;
    }

    public void move(Class figura, ChessPiece.Color boja, String pozicija){

    }

    public void move(String oldPosition, String newPosition) throws IllegalChessMoveException, IllegalArgumentException{

        int pomocniRed = 0, pomocnaKolona = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 8; j++){
                if (tabla[i][j] != null) {
                    if (tabla[i][j].getPosition().equals(newPosition)) {
                        //tabla[i][j] = null;
                        pomocniRed = i;
                        pomocnaKolona = j;
                    }
                }
            }
        }
        /*System.out.println(pomocniRed);
        System.out.println(pomocnaKolona);*/
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(tabla[i][j] != null) {
                    if (tabla[i][j].getPosition().equals(oldPosition)) {
                        for(int k = i; k < pomocniRed; k++) {
                            if (tabla[k][pomocnaKolona] != null){
                                throw new IllegalChessMoveException("Netačna pozicija");
                            }
                        }
                        //tabla[i][j].move(newPosition);
                    }
                }
            }
        }
    }
}
