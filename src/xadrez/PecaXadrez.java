package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public abstract class PecaXadrez extends Peca {
    //declarando atributos não herdados
    private Cor color;

    public PecaXadrez(Tabuleiro xadrez, Cor cor) {
        super(xadrez);
        this.color = cor;
    }//construtor com atributos herdados e não herdados

    //metodo para acessar atributos
    public Cor getColor() {
        return color;
    }//fim do metodo getter
}
