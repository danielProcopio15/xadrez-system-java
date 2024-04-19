package xadrez;

import JogoTabuleiro.Position;
import JogoTabuleiro.Position;

public class ChessPosition {

    public char coluna;
    public int linha;

    public ChessPosition(char coluna, int linha) {
        if (coluna < 'A' || coluna > 'H' || linha < 0 || linha > 8) {
            throw new ChessException("dados inválidos, só vale de A-H e 1-8");

        }


        this.coluna = coluna;
        this.linha = linha;
    }

    public int getLinha() {
        return linha;
    }

    public char getColuna() {
        return coluna;
    }

    protected Position toPosition(){
        return new Position(8 - linha, coluna - 'A');

    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('A' - position.getcoluna()), 8 - position.getLinha());


    }

    @Override
    public String toString() {
        return "" + coluna + linha;
    }


}
