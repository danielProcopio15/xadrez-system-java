package JogoTabuleiro;

public class Board {

    private int linhas;
    private int colunas;
    private Piece[][] pieces;//isso aqui indica que teremos dois vetores a serem preenchidos


    public Board(int linas, int colunas){
        this.linhas = linas;
        this.colunas = colunas;
        this.pieces = new Piece[linas][colunas];//isto é a cordenada


    }
}

