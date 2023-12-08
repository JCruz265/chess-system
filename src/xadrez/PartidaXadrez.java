package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
    //declarando atributo
    private Tabuleiro tabuleiro;
    public PartidaXadrez(){
        //instanciando o objeto tabuleiro definindo linhas e colunas com o mesmo valor de 8
        tabuleiro = new Tabuleiro(8, 8);
        configInicial();
    }//construtor padrão
    public PecaXadrez[][] getPecas(){
        //instanciando o objeto matriz quadrada peça de xadrez
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }//fim do for para colunas
        }//fim do for para linhas
        return mat;
    }//fim do metodo peça de xadrez
    private void configInicial(){
        tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
        tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,4));
        tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7,4));
    }
}
