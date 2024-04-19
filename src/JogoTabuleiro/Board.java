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

    public int getLinhas(){
        return linhas;

    }

    public void setLinhas(int linhas){
        this.linhas = linhas;
    }

    public int getColunas(){
        return colunas;
    }

    public void setColunas(int colunas){
        this.colunas = colunas;
    }

    public Piece piece(int linha, int coluna){
        return pieces[linha][coluna];
    }

    public Piece piece(Position position){
        return pieces[position.getLinha()][position.getcoluna()];
    }

    public void placePiece(Piece piece, Position position){
        pieces[position.getLinha()][position.getcoluna()] = piece;
        piece.position = position;
    }
}

