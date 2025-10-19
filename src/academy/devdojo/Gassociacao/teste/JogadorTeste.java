package academy.devdojo.Gassociacao.teste;

import academy.devdojo.Gassociacao.domain.Jogador;

public class JogadorTeste {
    public static void main(String[] args){

        Jogador jogador1 = new Jogador("Romário");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Garrincha");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
