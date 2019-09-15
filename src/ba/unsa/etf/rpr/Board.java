package ba.unsa.etf.rpr;

import java.util.*;

public class Board {

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
        String pomocni = "";
        char staraPozicija1 = oldPosition.charAt(0);
        char staraPozicija2 = oldPosition.charAt(1);
        char novaPozicija1 = newPosition.charAt(0);
        char novaPozicija2 = newPosition.charAt(1);
        int br = 0;
        if (staraPozicija1 == novaPozicija1) {
            char temp1 = staraPozicija1;
            char temp2 = staraPozicija2;
            temp2++;
            while (temp2 != novaPozicija2) {
                pomocni += staraPozicija1;
                pomocni += temp2;
                for (ChessPiece c : lista) {
                    if (c.getPosition().equals(pomocni)) {
                        return false;
                    }
                }
                if (br == 6) {
                    return false;
                }
                temp2++;
                pomocni = "";
                br++;
            }
        } else if (staraPozicija2 == novaPozicija2) {
            char temp1 = staraPozicija1;
            char temp2 = staraPozicija2;
            temp1++;
            while (temp1 != novaPozicija1) {
                pomocni += temp1;
                pomocni += staraPozicija2;
                for (ChessPiece c : lista) {
                    if (c.getPosition().equals(pomocni)) {
                        return false;
                    }
                }
                if (br == 6) {
                    return false;
                }
                temp1++;
                pomocni = "";
                br++;
            }
        } else {
            if (novaPozicija1 > staraPozicija1 && novaPozicija2 > staraPozicija2) {
                char temp1 = staraPozicija1;
                char temp2 = staraPozicija2;
                temp1++;
                temp2++;
                while (temp1 != novaPozicija1 && temp2 != novaPozicija2) {
                    pomocni += temp1;
                    pomocni += temp2;
                    for (ChessPiece c : lista) {
                        if (c.getPosition().equals(pomocni)) {
                            return false;
                        }
                    }
                    if (br == 6) {
                        return false;
                    }
                    temp1++;
                    temp2++;
                    pomocni = "";
                    br++;
                }
            } else if (novaPozicija1 < staraPozicija1 && novaPozicija2 > staraPozicija2) {
                char temp1 = staraPozicija1;
                char temp2 = staraPozicija2;
                temp1--;
                temp2++;
                while (temp1 != novaPozicija1 && temp2 != novaPozicija2) {
                    pomocni += temp1;
                    pomocni += temp2;
                    for (ChessPiece c : lista) {
                        if (c.getPosition().equals(pomocni)) {
                            return false;
                        }
                    }
                    if (br == 6) {
                        return false;
                    }
                    temp1--;
                    temp2++;
                    pomocni = "";
                    br++;
                }
            } else if (novaPozicija1 > staraPozicija1 && novaPozicija2 < staraPozicija2) {
                char temp1 = staraPozicija1;
                char temp2 = staraPozicija2;
                temp1--;
                temp2++;
                while (temp1 != novaPozicija1 && temp2 != novaPozicija2) {
                    pomocni += temp1;
                    pomocni += temp2;
                    for (ChessPiece c : lista) {
                        if (c.getPosition().equals(pomocni)) {
                            return false;
                        }
                    }
                    if (br == 6) {
                        return false;
                    }
                    temp1++;
                    temp2--;
                    pomocni = "";
                    br++;
                }
            } else {
                char temp1 = staraPozicija1;
                char temp2 = staraPozicija2;
                temp1--;
                temp2--;
                while (temp1 != novaPozicija1 && temp2 != novaPozicija2) {
                    pomocni += temp1;
                    pomocni += temp2;
                    for (ChessPiece c : lista) {
                        if (c.getPosition().equals(pomocni)) {
                            return false;
                        }
                    }
                    if (br == 6) {
                        return false;
                    }
                    temp1--;
                    temp2--;
                    pomocni = "";
                    br++;
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
        String pomocni = "";
        for(ChessPiece c : lista){
            if(c instanceof King && c.getColor().equals(boja)){
                pomocni = c.getPosition();
            }
        }
        String position2 = "";
        King king = new King(pomocni, boja);
        for (ChessPiece c : lista) {
            if (c.getColor() != boja && !(c instanceof Pawn)) {
                position2 = c.getPosition();
                try {
                    c.move(pomocni);
                } catch (IllegalChessMoveException e) {
                    continue;
                }
                if (!lista.contains(king)) {
                    lista.add(king);
                    try {
                        c.move(position2);
                    } catch (IllegalChessMoveException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
            } else if (c.getColor() != boja && (c instanceof Pawn)) {
                position2 = c.getPosition();
                try {
                    Pawn c2 = (Pawn) c.clone();
                    try {
                        c2.move(pomocni);

                    } catch (IllegalChessMoveException e) {
                        continue;
                    }
                    if (!lista.contains(king)) {
                        lista.add(king);
                        return true;
                    }
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

    public void move(Class type, ChessPiece.Color boja, String pozicija) throws IllegalChessMoveException {
        int temp = 0;
        String position = "";
        for (ChessPiece chessPiece : lista) {
            if (chessPiece.getClass().equals(type) && chessPiece.getColor() == boja && jeLiPutSlobodan(chessPiece.getPosition(), pozicija)) {
                position = chessPiece.getPosition();
                try {
                    chessPiece.move(pozicija);
                } catch (IllegalChessMoveException e) {
                    continue;
                }
                if (!chessPiece.getPosition().equals(position) ) {
                    temp = 1;
                    break;
                }
            }
        }
        if (temp == 0) throw new IllegalChessMoveException("Nemoguć potez!");

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
                    break;
                }

            }
        } else throw new IllegalChessMoveException("Netačna pozicija!");

        lista.removeAll(removeList);
        /*for(ChessPiece c : lista){
            if(c.getPosition().equals(oldPosition)){
                c.move(newPosition);
            }
        }*/

    }
}
