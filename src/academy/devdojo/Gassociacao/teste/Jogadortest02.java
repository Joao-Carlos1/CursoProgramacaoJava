package academy.devdojo.Gassociacao.teste;

import academy.devdojo.Gassociacao.domain.Jogador;
import academy.devdojo.Gassociacao.domain.Time;

public class Jogadortest02 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Selecao brasileira");

        jogador.setTime(time);

        jogador.imprime();
    }
}
