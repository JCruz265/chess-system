package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {
    public Rei(Tabuleiro xadrez, Cor cor) {
        super(xadrez, cor);
    }
    @Override
    public String toString(){
        return "R";
    }
}
