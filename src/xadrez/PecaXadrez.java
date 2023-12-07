package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca {
    //declarando atributos não herdados
    private Color color;

    public PecaXadrez(Tabuleiro xadrez, Color color) {
        super(xadrez);
        this.color = color;
    }//construtor com atributos herdados e não herdados
    //metodo para acessar atributos

    public Color getColor() {
        return color;
    }
}
