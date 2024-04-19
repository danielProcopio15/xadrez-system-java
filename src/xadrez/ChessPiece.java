package xadrez;

import JogoTabuleiro.Board;
import JogoTabuleiro.Piece;

import java.awt.*;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;// acor apenas pode ser acessada


    }
}
