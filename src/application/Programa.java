package application;

import JogoTabuleiro.Board;
import JogoTabuleiro.Position;
import xadrez.ChessException;
import xadrez.ChessMatch;
import xadrez.ChessPiece;
import xadrez.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Position p1 = new Position(3, 5);

        ChessMatch chessMatch = new ChessMatch();

        while (true){

            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("inicio: ");
                ChessPosition source = UI.readChessPosition(scanner);

                System.out.println();
                System.out.print("Alvo:  ");
                ChessPosition target = UI.readChessPosition(scanner);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                scanner.nextLine();}









    }
}
}
