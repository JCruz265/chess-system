package tabuleiro;

public class Peca {
    //declarando atributos
    protected Posicao posicao;
    private Tabuleiro xadrez;

    public Peca(Tabuleiro xadrez) {
        this.xadrez = xadrez;
        this.posicao = null;
    }//construtor com argumentos

    protected Tabuleiro getXadrez() {
        return xadrez;
    }
}
