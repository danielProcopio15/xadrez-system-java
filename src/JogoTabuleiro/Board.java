package JogoTabuleiro;

import JogoTabuleiro.Position;
import JogoTabuleiro.Piece;
import xadrez.pieces.Rei;
import xadrez.pieces.Torre;
import JogoTabuleiro.BoardException;


public class Board {

    private int linhas;
    private int colunas;
    private Piece[][] pieces;//isso aqui indica que teremos dois vetores a serem preenchidos


    public Board(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            throw new BoardException("para criar, precisa ao menos de uma linha e uma coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pieces = new Piece[linhas][colunas];//isto é a cordenada


    }

    public int getLinhas() {
        return linhas;

    }


    public int getColunas() {
        return colunas;
    }


    public Piece piece(int linha, int coluna) {
        return pieces[linha][coluna];
    }

    public Piece piece(Position position) {
        return pieces[position.getLinha()][position.getcoluna()];
    }


    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("aqui já tem uma peça" + position);
        }
        pieces[position.getLinha()][position.getcoluna()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("posiçao nao esta no tabuleiro");
        }

        if (piece(position) == null) {
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;

        pieces[position.getLinha()][position.getcoluna()] = null;
        return aux;


    }









    public Boolean positionExists(int linha, int coluna){
        return linha >=0 && linha < linhas && coluna >=0 && coluna < colunas;
    }
    public Boolean positionExists(Position position){
        return positionExists(position.getLinha(), position.getcoluna());
    }



    public boolean thereIsAPiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Posição fora do tabuleiro");}
        return pieces[position.getLinha()][position.getcoluna()] != null;

    }


}

