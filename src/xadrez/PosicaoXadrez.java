package xadrez;

public class PosicaoXadrez {
    //declarando atributos
    private char coluna;
    private int linha;

    public PosicaoXadrez(char coluna, int linha) {
        if(coluna < 'a' || coluna > 'h' )
        this.coluna = coluna;
        this.linha = linha;
    }
}
