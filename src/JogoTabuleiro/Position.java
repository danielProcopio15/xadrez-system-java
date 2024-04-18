package JogoTabuleiro;

public class Position {
    private int linha;
    private int coluna;

    public Position(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;

    }

    public int getLinha() {
        return linha;
    }
    public int getcoluna() {
        return coluna;
    }
    public void setLinha(int linha) {
        this.linha = linha;
    }
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public String toString() {
        return linha + "," + coluna;
    }
}
