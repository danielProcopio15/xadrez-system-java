package xadrez.pieces;
import xadrez.Color;
import JogoTabuleiro.Board;
import xadrez.ChessPiece;

public class Rei extends ChessPiece {

    public Rei(Board board, Color color) {
        super(board, color);

    }

    @Override
    public String toString(){
        return "R";
    }
}
