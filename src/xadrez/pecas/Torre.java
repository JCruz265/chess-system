package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {
    public Torre(Tabuleiro xadrez, Cor cor) {
        super(xadrez, cor);
    }
    @Override
    public String toString(){
        return "T";
    }
}
