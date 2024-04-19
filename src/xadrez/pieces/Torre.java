package xadrez.pieces;
import JogoTabuleiro.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class Torre extends ChessPiece{

    public Torre(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "T";
    }

}
