package app;

import xadrez.PartidaXadrez;

public class XadrezApp {
    public static void main(String[] args) {
        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.plotarTabuleiro(partidaXadrez.getPecas());
    }
}
