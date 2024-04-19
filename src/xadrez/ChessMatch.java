package xadrez;
import JogoTabuleiro.Position;
import JogoTabuleiro.Board;
import xadrez.pieces.Torre;
import xadrez.pieces.Rei;

import JogoTabuleiro.Piece;


public class ChessMatch {

    public Board board;

    public ChessMatch() {
       board = new Board(8,8);/////-----alteração aqui
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getLinhas()][board.getColunas()];
        for (int i = 0; i < board.getLinhas(); i++) {
            for (int j = 0 ; j < board.getColunas(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }

        }
        return mat;


    }

    private void initialSetup(){
        board.placePiece(new Torre(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new Rei(board, Color.BLACK), new Position(2, 2));
        board.placePiece(new Rei(board, Color.WHITE), new Position(7, 4));
    }

}
