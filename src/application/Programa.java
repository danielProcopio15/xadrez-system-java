package application;

import JogoTabuleiro.Board;
import JogoTabuleiro.Position;
import xadrez.ChessMatch;

public class Programa {
    public static void main(String[] args) {

        Position p1 = new Position(3, 5);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());





    }
}
