package JogoTabuleiro;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board){//aqui eu tenho que deixar público para a classe ficar a mostra o tempo todo
        this.board = board;
        position = null;
    }

    protected Board getBoard(){
        return board;

    }

}
