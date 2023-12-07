package tabuleiro;

public class Tabuleiro {
    //declarando atributos
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }//construtor com argumentos

    //metodos para (re)definir atributos
    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }//fim dos metodos setter's
    //metodos para acessar atributos

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }//fim dos metodos getter's

    //metodo para retornar uma peça atraves posição/matriz
    public Peca peca(int linha, int coluna) {
        return pecas[linha][coluna];
    }//fim do metodo peça
    //sobrecarga do metodo peca
    public Peca peca(Posicao posicao) {
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }//fim da sobrecarga do metodo peca
}
