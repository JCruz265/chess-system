package tabuleiro;

public abstract class Peca {
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
    public abstract boolean[][] movimentosPossiveis();
    public boolean movimentoPossivel(Posicao posicao){
        return movimentosPossiveis()[posicao.getLinha()][posicao.getColuna()];
    }
    public boolean ePossivelMover(){
        boolean[][] mat = movimentosPossiveis();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
             if(mat[i][j]){
                 return true;
             }
            }
        }return false;
    }
}
