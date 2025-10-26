package academy.devdojo.Gassociacao.teste;

import academy.devdojo.Gassociacao.domain.Jogador;
import academy.devdojo.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Brasil");
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1, jogador2};
        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        jogador1.imprime();
        System.out.println("-----------------------");
        jogador2.imprime();
        System.out.println("-----------------------");
        time.imprime();
        System.out.println("-----------------------");


    }
}
