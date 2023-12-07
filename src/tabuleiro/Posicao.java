package tabuleiro;

public class Posicao {
    private int linha;
    private int coluna;

    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }//construtor com argumentos
    //metodos para (re)definir atributos
    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }//fim dos metodos setter's
    //metodos para acessar atributos
    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }//fim dos metodos getter's
    @Override
    public String toString(){
        return linha+ ", "+ coluna;
    }
}
