package academy.devdojo.Eblocosinicializacao.test;


import academy.devdojo.Eblocosinicializacao.domain.Anime;

public class AnimetTest {
    public static void main(String[] args){
        Anime anime = new Anime();

        for(int episodios: anime.getEpisodios()){
            System.out.print(episodios + " ");
        }
    }
}
