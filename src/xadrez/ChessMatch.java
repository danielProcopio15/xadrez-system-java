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
    private void PlaceNewPiece(char coluna, int linha, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(coluna, linha).toPosition());

    }


    private void initialSetup(){
        PlaceNewPiece('C', 1, new Torre(board, Color.WHITE));
        PlaceNewPiece('C', 2, new Torre(board, Color.WHITE));
        PlaceNewPiece('D', 2, new Torre(board, Color.WHITE));
        PlaceNewPiece('E', 2, new Torre(board, Color.WHITE));
        PlaceNewPiece('E', 1, new Torre(board, Color.WHITE));
        PlaceNewPiece('D', 1, new Rei(board, Color.WHITE));

        PlaceNewPiece('C', 7, new Torre(board, Color.BLACK));
        PlaceNewPiece('C', 8, new Torre(board, Color.BLACK));
        PlaceNewPiece('D', 7, new Torre(board, Color.BLACK));
        PlaceNewPiece('E', 7, new Torre(board, Color.BLACK));
        PlaceNewPiece('D', 8, new Torre(board, Color.BLACK));
        PlaceNewPiece('E', 8, new Rei(board, Color.BLACK));
    }

}
