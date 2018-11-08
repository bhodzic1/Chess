package ba.unsa.etf.rpr;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Board {

    //public List<ChessPiece> lista = new ArrayList<ChessPiece>();
    public ArrayList<ChessPiece> lista = new ArrayList<>();

    public Board() {

        lista.add(new King("E1", ChessPiece.Color.WHITE));
        lista.add(new King("E8", ChessPiece.Color.BLACK));
        lista.add(new Queen("D1", ChessPiece.Color.WHITE));
        lista.add(new Queen("D8", ChessPiece.Color.BLACK));
        lista.add(new Rook("A1", ChessPiece.Color.WHITE));
        lista.add(new Rook("H1", ChessPiece.Color.WHITE));
        lista.add(new Rook("A8", ChessPiece.Color.BLACK));
        lista.add(new Rook("H8", ChessPiece.Color.BLACK));
        lista.add(new Bishop("C1", ChessPiece.Color.WHITE));
        lista.add(new Bishop("F1", ChessPiece.Color.WHITE));
        lista.add(new Bishop("C8", ChessPiece.Color.BLACK));
        lista.add(new Bishop("F8", ChessPiece.Color.BLACK));
        lista.add(new Knight("B1", ChessPiece.Color.WHITE));
        lista.add(new Knight("G1", ChessPiece.Color.WHITE));
        lista.add(new Knight("B8", ChessPiece.Color.BLACK));
        lista.add(new Knight("G8", ChessPiece.Color.BLACK));
        lista.add(new Pawn("A2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("B2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("C2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("D2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("E2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("F2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("G2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("H2", ChessPiece.Color.WHITE));
        lista.add(new Pawn("A7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("B7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("C7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("D7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("E7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("F7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("G7", ChessPiece.Color.BLACK));
        lista.add(new Pawn("H7", ChessPiece.Color.BLACK));

    }

    public boolean jeLiPozicijaZauzeta(String position){
        for(ChessPiece c : lista){
            if(c.getPosition().equals(position))
                return true;
        }
        return false;
    }

    public boolean jeLiPutSlobodan(String oldPosition, String newPosition){
        String pomocni = new String("");
        int staraPozicija1 = oldPosition.charAt(0);
        int staraPozicija2 = oldPosition.charAt(1);
        int novaPozicija1 = newPosition.charAt(0);
        int novaPozicija2 = newPosition.charAt(1);

        if(oldPosition.charAt(0) == newPosition.charAt(0)){
            int temp1 = oldPosition.charAt(1);
            int temp2 = newPosition.charAt(1);
            int temp3 = oldPosition.charAt(0);
            int temp4 = oldPosition.charAt(1);
            int temp5 = newPosition.charAt(1);
            temp5++;
            temp1++;
            char pom1 = (char) temp3;
            char pom2 = (char) temp1;
            char pom5 = (char) temp5;
            if(temp2 > temp1) {
                while (temp2 > temp1) {
                    pomocni += Character.toString(pom1);
                    pomocni += Character.toString(pom2);
                    for(ChessPiece c : lista){
                        if(c.getPosition().equals(pomocni))
                            return false;
                    }

                    temp1++;
                }
            }
            else {
                while (temp4 > temp5) {
                    pomocni += Character.toString(pom1);
                    pomocni += Character.toString(pom5);
                    for(ChessPiece c : lista){
                        if(c.getPosition().equals(pomocni))
                            return false;
                    }

                    temp5++;
                }
            }
        }

        else if(Math.abs(novaPozicija1 - staraPozicija1) == Math.abs(novaPozicija2 - staraPozicija2)){
            if(novaPozicija1 > staraPozicija1 && novaPozicija2 < staraPozicija2){
                staraPozicija1++;
                staraPozicija2--;
                char a1 = (char) staraPozicija1;
                char a2 = (char) staraPozicija2;
                while(novaPozicija1 > staraPozicija1 && novaPozicija2 < staraPozicija2){
                    pomocni += Character.toString(a1);
                    pomocni += Character.toString(a2);
                    for(ChessPiece c : lista){
                        if(c.getPosition().equals(pomocni))
                            return false;
                    }
                    staraPozicija1++;
                    staraPozicija2--;
                }
            }
            else if(novaPozicija1 < staraPozicija1 && novaPozicija2 < staraPozicija2){
                staraPozicija1--;
                staraPozicija2--;
                char a1 = (char) staraPozicija1;
                char a2 = (char) staraPozicija2;
                while(novaPozicija1 < staraPozicija1 && novaPozicija2 < staraPozicija2){
                    pomocni += Character.toString(a1);
                    pomocni += Character.toString(a2);
                    for(ChessPiece c : lista){
                        if(c.getPosition().equals(pomocni))
                            return false;
                    }
                    staraPozicija1--;
                    staraPozicija2--;
                }
            }
            else if(novaPozicija1 < staraPozicija1 && novaPozicija2 > staraPozicija2){
                staraPozicija1--;
                staraPozicija2++;
                char a1 = (char) staraPozicija1;
                char a2 = (char) staraPozicija2;
                while(novaPozicija1 < staraPozicija1 && novaPozicija2 > staraPozicija2){
                    pomocni += Character.toString(a1);
                    pomocni += Character.toString(a2);
                    for(ChessPiece c : lista){
                        if(c.getPosition().equals(pomocni))
                            return false;
                    }
                    staraPozicija1--;
                    staraPozicija2++;
                }
            }
            else if(novaPozicija1 > staraPozicija1 && novaPozicija2 > staraPozicija2){
                staraPozicija1++;
                staraPozicija2++;
                char a1 = (char) staraPozicija1;
                char a2 = (char) staraPozicija2;
                while(novaPozicija1 > staraPozicija1 && novaPozicija2 > staraPozicija2){
                    pomocni += Character.toString(a1);
                    pomocni += Character.toString(a2);
                    for(ChessPiece c : lista){
                        if(c.getPosition().equals(pomocni))
                            return false;
                    }
                    staraPozicija1++;
                    staraPozicija2++;
                }
            }
        }
        return true;
    }

    public boolean jeLiZaPojesti(String oldPosition, String newPosition){
        for(ChessPiece c : lista){
            if(c.getPosition().equals(oldPosition)){
                for(ChessPiece d : lista){
                    if(d.getPosition().equals(newPosition)){
                        if(c.getColor().equals(d.getColor())){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean isCheck(ChessPiece.Color boja) {
        String pomocni = new String("");
        for(ChessPiece c : lista){
            if(c instanceof King && c.getColor().equals(boja)){
                pomocni = c.getPosition();
            }
        }

        int brojac = 0;
        String pomocni2 = new String("");
        char temp1 = pomocni.charAt(0);
        char pom1 = pomocni.charAt(1);
        pom1--;
        pomocni2 += temp1;
        pomocni2 += pom1;
        /*while(jeLiPutSlobodan(pomocni, pomocni2)){

        }*/

        return true;
    }

    public void move(Class type, ChessPiece.Color boja, String pozicija){


    }

    public void move(String oldPosition, String newPosition) throws IllegalChessMoveException, IllegalArgumentException{
        List<ChessPiece> removeList = new ArrayList<>();
        if(jeLiPutSlobodan(oldPosition, newPosition)) {
            for(ChessPiece c : lista){
                if(c.getPosition().equals(oldPosition)){
                    if (jeLiPozicijaZauzeta(newPosition)) {

                        for(ChessPiece d : lista){
                            if (d.getPosition().equals(newPosition) && jeLiZaPojesti(oldPosition, newPosition)) {
                                removeList.add(d);
                            }
                        }

                    }
                    c.move(newPosition);
                }

            }

        }
        else throw new IllegalChessMoveException("Netačna pozicija!");
        lista.removeAll(removeList);
        /*for(ChessPiece c : lista){
            if(c.getPosition().equals(oldPosition)){
                c.move(newPosition);
            }
        }*/

    }
}
