package application;

import JogoTabuleiro.Board;
import JogoTabuleiro.Position;
public class Programa {
    public static void main(String[] args) {

        Position p1 = new Position(3, 5);

        System.out.println(p1.toString());

            Board board = new Board(10,10);

            System.out.println(board);
    }
}
